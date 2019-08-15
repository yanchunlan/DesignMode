package com.example.designmode.test.all._07_command._02;

import java.util.Map;

/**
 * author:  ycl
 * date:  2019/08/15 16:46
 * desc:
 */
public interface IRequestParam {
    Map<String, Object> getRequestParam();

    void put(String s, String s1);
}
