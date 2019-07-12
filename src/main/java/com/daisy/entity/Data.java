package com.daisy.entity;

import java.util.Map;

/**
 * @author 18080
 * @version V1.0.0
 * @Package com.daisy.entity
 * @Description:
 * @date 2019/6/27 18:54
 */
public class Data<T> {
    private Map<String,Object> map;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data() {
    }

}
