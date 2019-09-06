package com.example.designmode.test.all._13_proxy._02;

import com.example.designmode.test.all._13_proxy._01.Benz;
import com.example.designmode.test.all._13_proxy._01.ICar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main_Client {
    public static void main(String[] args) {
        ICar iCar = new Benz();

        InvocationHandler handler = new CarHandler(iCar);// 仅仅是提供你给代理类
        // 代理类动态创建
        ICar proxy = (ICar) Proxy.newProxyInstance(ICar.class.getClassLoader(),
                new Class[]{ICar.class},
                handler);

        proxy.move();
    }
}