package com.example.designmode.test.all._13_proxy._02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author:  ycl
 * date:  2019/09/06 13:45
 * desc:    动态代理
 */
public class CarHandler implements InvocationHandler {

    private Object object;

    public CarHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method.invoke");

        Object result = method.invoke(object, args);

        return result;
    }
}
