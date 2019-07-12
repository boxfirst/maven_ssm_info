<%--
  Created by IntelliJ IDEA.
  User: 18080
  Date: 2019/6/26
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>员工列表</title>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/user/js/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/user/js/list.js"></script>
</head>
<body>
<!-- 搭建显示页面 -->
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-2 col-md-offset-10">
            <button class="btn btn-primary" id="add_model">新增</button>
            <button class="btn btn-danger" id="delete_all">删除</button>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th><input type="checkbox" id="checkbox_all" class="checkbox"></th>
                    <th>#</th>
                    <th>账号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>密码</th>
                    <th>电话</th>
                    <th>职务</th>
                    <th>注册时间</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="info" varStatus="statu">
                    <tr>
                        <th><input type="checkbox" class="checkbox_one checkbox"></th>
                        <th>${statu.index+1}</th>
                        <th>${info.infornumber}</th>
                        <th>${info.inforname}</th>
                        <th>${info.sex=="boy"?"男":"女"}</th>
                        <th>${info.inforage}</th>
                        <th>${info.inforpassword}</th>
                        <th>${info.inforphone}</th>
                        <th>${info.job.jobname}</th>
                        <th><fmt:formatDate value="${info.registdate}" type="time" pattern="yyyy-MM-dd hh:mm:ss"/></th>
                        <th>
                            <button edit_id="${info.inforid}" class="btn edit_btn btn-info">
                                <span class=" icon-pencil"></span>
                                修改
                            </button>
                            <button delete_id="${info.inforid}" class="btn delete_btn btn-danger">
                                <span class="icon-trash"></span>
                                删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <!-- 分页插件 -->
    <div class="row">
        <div class="col-md-5">当前第 ${pageInfo.pageNum} 页，共 ${pageInfo.pages} 页，共 ${pageInfo.total} 条记录</div>
        <div class="col-md-7">
            <nav aria-label="Page navigation">
                <ul class="pagination pagination-right">
                    <c:if test="${pageInfo.pageNum!=1}">
                        <li><a href="${pageContext.request.contextPath }/list?pageNum=1">首页</a></li>
                    </c:if>
                    <c:if test="${pageInfo.pages!=1}">
                        <li><a href="${pageContext.request.contextPath }/list?pageNum=${pageInfo.pageNum-1}">上一页</a></li>
                    </c:if>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="nav">
                        <c:if test="${nav == pageInfo.pageNum }">
                            <li class="active"><a href="#">${nav }</a></li>
                        </c:if>
                        <c:if test="${nav != pageInfo.pageNum }">
                            <li><a href="${pageContext.request.contextPath }/list?pageNum=${nav}">${nav }</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.pages!=pageInfo.pageNum}">
                        <li><a href="${pageContext.request.contextPath }/list?pageNum=${pageInfo.pageNum+1}">下一页</a>
                        </li>
                    </c:if>
                    <c:if test="${pageInfo.pageNum!=pageInfo.navigateLastPage}">
                        <li><a href="${pageContext.request.contextPath }/list?pageNum=${pageInfo.pages}">尾页</a></li>
                    </c:if>
                </ul>
            </nav>
        </div>
    </div>

    <!-- Button trigger modal -->
    <%--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">--%>
        <%--Launch demo modal--%>
    <%--</button>--%>

    <!-- 添加的模态框 -->
    <div class="modal fade" id="AddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close close_butten" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加用户</h4>
                </div>
                <div class="modal-body">
                    <form id="addForm" class="form-horizontal">
                        <div class="form-group">
                            <label for="inforname" class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforname" id="inforname" placeholder="你的名字？">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inlineRadio1" class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio1" value="boy"> 男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio2" value="girl"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inforage" class="col-sm-2 control-label">年龄</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforage" id="inforage" placeholder="你的年龄？">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inforphone" class="col-sm-2 control-label">联系电话</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforphone" id="inforphone" placeholder="你的联系方式？">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="jobid" class="col-sm-2 control-label">职务</label>
                            <div class="col-sm-10">
                                <%--<input type="email" class="form-control" id="inputEmail3" placeholder="Email">--%>
                                <select name="jobid" id="jobid" class="form-control"></select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn closeModel btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" id="addInforModel" class="btn btn-primary">添加</button>
                </div>
            </div>
        </div>
    </div>

    <!-- 修改的模态框 -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close close_butten" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">修改用户</h4>
                </div>
                <div class="modal-body">
                    <form id="editForm" class="form-horizontal">
                        <div class="form-group">
                            <label for="editinforname" class="col-sm-2 control-label">账号</label>
                            <div class="col-sm-10">
                                <p id="editstaticnumber" class="form-control-static"></p>
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editinforname" class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforname" id="editinforname">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inlineRadio3" class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio3" value="boy"> 男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio4" value="girl"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editinforage" class="col-sm-2 control-label">年龄</label>
                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="inforage" id="editinforage">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editinforpassword" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforpassword" id="editinforpassword">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="editinforphone" class="col-sm-2 control-label">联系电话</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" name="inforphone" id="editinforphone">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="jobid" class="col-sm-2 control-label">职务</label>
                            <div class="col-sm-10">
                                <%--<input type="email" class="form-control" id="inputEmail3" placeholder="Email">--%>
                                <select name="jobid" id="editjobid" class="form-control"></select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn closeModel btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" id="editInforModel" class="btn  btn-primary">修改</button>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
