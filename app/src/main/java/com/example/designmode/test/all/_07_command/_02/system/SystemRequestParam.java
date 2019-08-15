package com.example.designmode.test.all._07_command._02.system;

import com.example.designmode.test.all._07_command._02.IRequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * author:  ycl
 * date:  2019/08/15 16:47
 * desc:
 */
public class SystemRequestParam implements IRequestParam {

    private HashMap<String, Object> map = new HashMap<>();

    @Override
    public Map<String, Object> getRequestParam() {
        return map;
    }

    @Override
    public void put(String s, String s1) {
        map.put(s, s1);
    }
}
