package com.daisy.controller;

import com.daisy.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.controller
 * @Description:
 * @date 2019/6/27 13:16
 */
@Controller
public class JobController {

    @Resource
    private JobService jobService;

    @ResponseBody
    @RequestMapping("/getJob")
    public Object[] getJob() {
//        System.out.println("获取职务信息");
        Object[] getjob = jobService.getAllJob().toArray();
        System.out.println(getjob);
        return getjob;
    }

}
