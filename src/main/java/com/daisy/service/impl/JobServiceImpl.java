package com.daisy.service.impl;

import com.daisy.entity.Job;
import com.daisy.mapper.JobMapper;
import com.daisy.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.service.impl
 * @Description:
 * @date 2019/6/27 13:18
 */
@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;

    @Override
    public List<Job> getAllJob() {
        return jobMapper.selectByExample(null);
    }
}
