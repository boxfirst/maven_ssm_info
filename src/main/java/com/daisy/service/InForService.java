package com.daisy.service;

import com.daisy.entity.InFor;

import java.util.List;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.service
 * @Description:
 * @date 2019/6/26 21:13
 */
public interface InForService {

    /**
     * @return 所有用户信息
     */
    List<InFor> getAll();

    boolean save(InFor in);

    boolean getName(String name);

    InFor getInFor(long id);

    boolean edit(InFor in);

    boolean delete(List<Long> list);

}
