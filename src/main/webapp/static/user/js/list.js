$(function () {
    $("#add_model").click(function () {
        // 职务信息
        getJob("#jobid");
        // 弹出模态框
        $("#AddModal").modal({
            backdrop: "static"
        });
    });

    $(".closeModel").click(function () {
        location = location;
    });
    $(".close_butten").click(function () {
        location = location;
    });

    $("#addInforModel").click(function () {

        var validate = validate_add_form();
        // var validate = true;

        alert(validate);

        if (validate) {
            var data = $("#addForm").serialize();
            //序列化中文时之所以乱码是因为.serialize()调用了encodeURLComponent方法将数据编码了
            //使用decodeURIComponent解决
            data = decodeURIComponent(data, true);
            $.ajax({
                url: getprojectPath() + "/info",
                type: "POST",
                data: data,
                success: function (reluet) {
                    alert(reluet);
                    location = getprojectPath() + "/list?pageNum=" + 99999;
                }
            });
        }

    });

    function getJob(elemp) {
        var path = getprojectPath();
        $.ajax({
            url: path + "/getJob",
            type: "GET",
            dataType: "json",
            success: function (result) {
                $.each(result, function () {
                    var option = $("<option></option>").append(this.jobname).attr("value", this.jobid);
                    $(elemp).append(option);
                });
            }
        });
    }

    function getprojectPath() {
        var curWwwPath = window.document.location.href;
        var pathName = window.document.location.pathname;
        var pos = curWwwPath.indexOf(pathName);
        //获取主机地址，如： http://localhost:8083
        var localhostPaht = curWwwPath.substring(0, pos);
        //获取带"/"的项目名，如：/uimcardprj
        var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return (localhostPaht + projectName);
    }

    function validate_add_form() {
        var elemp_name = $("#inforname").val();
        $("#inforname").change(validate_name_user(elemp_name));

        var elemp_age = $("#inforage").val();
        alert(elemp_age)
        if (elemp_age < 0) {
            validate_type("#inforage", "error", "你的年龄过小");
            return false;
        } else if (elemp_age > 100) {
            validate_type("#inforage", "error", "你的年龄过大");
            return false;
        } else {
            validate_type("#inforage", "success", null);
        }

        var elemp_phone = $("#inforphone").val();
        var reg_phone = /^[0-9]{11}$/;
        if (!reg_phone.test(elemp_phone)) {
            validate_type("#inforphone", "error", "亲输入正确的电话号码");
            return false;
        } else {
            validate_type("#inforphone", "success", null);
        }
        return true;
    }

    function validate_type(ele, static, msg) {
        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if ("success" == static) {
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text("");
        } else if ("error" == static) {
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }

    function validate_name_user(name) {
        var reg_name = /(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
        if (!reg_name.test(name)) {
            validate_type("#inforname", "error", "用户名格式错误，需要6-16位英文字母或者2-5位中文字符");
            return false;
        } else {
            $.ajax({
                url: getprojectPath() + "/chickName",
                type: "POST",
                data: "name=" + name,
                success: function (reluet) {
                    alert("返回结果：" + reluet);
                    if ("true" == reluet) {
                        return true;
                    } else if ("false" == reluet) {
                        validate_type("#inforname", "error", "用户名已被占用");
                        return false;
                    } else {
                        validate_type("#inforname", "success", null);
                    }
                }
            });
        }

    }


    var edit_btn_id;

    $(".edit_btn").click(function () {
        // 职务信息
        getJob("#editjobid");

        edit_btn_id = $(this).attr("edit_id");
        getInfor(edit_btn_id);

        // 弹出模态框
        $("#editModal").modal({
            backdrop: "static"
        });
    });

    function getInfor(id) {
        $.ajax({
            url: getprojectPath() + "/info/" + id,
            type: "GET",
            dataType: "json",
            success: function (relust) {
                var data = relust.map.info;
                $("#editstaticnumber").text(data.infornumber);
                $("#editinforname").attr("value", data.inforname);
                $("#editModal input[name=sex]").val([data.sex]);
                $("#editinforage").attr("value", data.inforage);
                $("#editinforpassword").attr("value", data.inforpassword);
                $("#editinforphone").attr("value", data.inforphone);
                $("#editModal select").val([data.jobid]);
            }
        });
    }

    $("#editInforModel").click(function () {
        //跳过验证数据格式
        $.ajax({
            url: getprojectPath() + "/info/" + edit_btn_id,
            type: "PUT",
            data: $("#editForm").serialize(),
            success: function (relust) {
                alert(relust);
                $("#editModal").modal("hide");
                location = location;
            },
            error: function (relust) {
                alert(relust);
            }
        });
    });

    $(".delete_btn").click(function () {
        var name = $(this).parents("tr").find("th:eq(2)").text();
        if (confirm("确认删除用户名为【" + name + "】的用户吗？")) {
            var id = $(this).attr("delete_id");
            $.ajax({
                url: getprojectPath() + "/info/" + id,
                type: "DELETE",
                success: function (relust) {
                    alert(relust);
                    location = location;
                }
            });
        }
    });

    $("#checkbox_all").click(function () {
        $(".checkbox_one").prop("checked", $(this).prop("checked"));
    });
    $(".checkbox_one").click(function () {
        $("#checkbox_all").prop("checked", $(".checkbox_one").length == $(".checkbox_one:checked").length);
    });

    $("#delete_all").click(function () {
        var names = "";
        $.each($(".checkbox_one:checked"), function () {
            names += $(this).parents("tr").find("th:eq(3)").text() + " , ";
        });
        names = names.substring(0, names.length - 3);
        if (confirm("确认删除用户名为【" + names + "】的用户吗？")) {
            var ids="";
            $.each($(".checkbox_one:checked"), function () {
                ids += $(this).parents("tr").find(".delete_btn").attr("delete_id") + "-";
            });
            ids = ids.substring(0, ids.length - 1);
            alert(ids)
            $.ajax({
                url: getprojectPath() + "/info/" + ids,
                type: "DELETE",
                success: function (relust) {
                    alert(relust);
                    location = location;
                }
            });
        }
    });

});