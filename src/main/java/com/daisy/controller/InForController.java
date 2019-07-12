package com.daisy.controller;

import com.daisy.entity.Data;
import com.daisy.entity.InFor;
import com.daisy.service.InForService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.controller
 * @Description:
 * @date 2019/6/26 21:10
 */
@Controller
public class InForController {

    @Resource
    private InForService service;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "6") int pageSize,
                       Model model) {

        PageHelper.startPage(pageNum, pageSize);
        PageInfo page = new PageInfo(service.getAll());
        model.addAttribute("pageInfo", page);
        return "list";
    }

    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public String save(@Valid InFor inFor, BindingResult result) {
        if (result.hasErrors()) {
            return "添加失败，" + result.getObjectName();
        } else {
            String infornumber = UUID.randomUUID().toString().substring(2, 8) + new Random().nextInt(10);
            inFor.setInfornumber(infornumber);
            inFor.setInforpassword("123456");
            inFor.setRegistdate(new Timestamp(new java.util.Date().getTime()));
//        System.out.println(inFor);
            boolean save = service.save(inFor);
//        boolean save = true;
            if (save) {
                return "添加成功";
            } else {
                return "添加失败";
            }
        }
    }

    @ResponseBody
    @RequestMapping("/chickName")
    public Object chickName(String name) {
        System.out.println("获取的：" + name);
        boolean name1 = service.getName(name);
        if (name1) {
            return "true";
        } else {
            return "false";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public Data<InFor> getInfor(@PathVariable("id") int id) {
        InFor inFor = service.getInFor(id);
        Data<InFor> data = new Data();
        HashMap<String, Object> map = new HashMap<>();
        map.put("info", inFor);
        data.setMap(map);
        return data;
    }

    /**
     * @param inFor
     * @param result
     * @return
     * @Valid 用于JSR303校验数据，在实体类中规定的规则
     * BindingResult result用于返回JSR303验证的信息
     */
    @ResponseBody
    @RequestMapping(value = "/info/{inforid}", method = RequestMethod.PUT)
    public String update(@Valid InFor inFor, BindingResult result) {
        System.out.println(inFor);
        boolean edit = service.edit(inFor);
        if (edit) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/info/{id}", method = RequestMethod.DELETE)
    public String deleteOne(@PathVariable("id") String ids) {
//        System.out.println("删除的单个id值：" + ids);
        ArrayList<Long> list = new ArrayList<>();
        if (ids.contains("-")) {
            String[] strings = ids.split("-");
            for (String id : strings) {
                list.add(Long.parseLong(id));
            }
        } else {
            list.add(Long.parseLong(ids));
        }
        boolean delete = service.delete(list);
//        System.out.println("执行结果：" + delete);
        if (delete) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

}
