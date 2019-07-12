package com.daisy.service.impl;

import com.daisy.entity.InFor;
import com.daisy.entity.InForExample;
import com.daisy.mapper.InForMapper;
import com.daisy.service.InForService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.service.impl
 * @Description:
 * @date 2019/6/26 21:15
 */
@Service
public class InForServiceImpl implements InForService {

    @Resource
    private InForMapper mapper;

    @Override
    public List<InFor> getAll() {
        return mapper.selectByExampleWithJob(null);
    }

    @Override
    public boolean save(InFor in) {
        mapper.insertSelective(in);
        return true;
    }

    @Override
    public boolean getName(String name) {
        InForExample inForExample = new InForExample();
        InForExample.Criteria criteria = inForExample.createCriteria();
        criteria.andInfornameEqualTo(name);
        long count = mapper.countByExample(inForExample);
//        System.out.println(name + "有" + count + "个");
        if (count != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public InFor getInFor(long id) {
        return mapper.selectByPrimaryKey(id);

    }

    @Override
    public boolean edit(InFor in) {
        int update = mapper.updateByPrimaryKeySelective(in);
//        System.out.println("修改成功记录数：" + update);
        return true;
    }

    @Override
    public boolean delete(List<Long> list) {
        if (list.size() == 1) {
//            System.out.println("单个："+list.get(0));
            int delete = mapper.deleteByPrimaryKey(list.get(0));
//            System.out.println("删除一条记录："+delete);
            return true;
        } else if (list.size() > 1) {
//            System.out.println("多个");
            InForExample inForExample = new InForExample();
            InForExample.Criteria criteria = inForExample.createCriteria();
            criteria.andInforidIn(list);
            int delete = mapper.deleteByExample(inForExample);
//            System.out.println("删除多条记录："+delete);
            return true;
        } else {
//            System.out.println("没有值");
            return false;
        }
    }
}
