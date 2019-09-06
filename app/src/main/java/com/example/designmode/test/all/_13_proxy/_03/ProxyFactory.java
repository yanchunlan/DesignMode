package com.example.designmode.test.all._13_proxy._03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author:  ycl
 * date:  2019/09/06 13:59
 * desc: 动态代理+简单工厂
 */
public class ProxyFactory<T> {

    private T client;
    private Iintercept intercept;
    private IBefore before;
    private IAfter after;


    public  <T> T createProxy() {
        ClassLoader classLoader = client.getClass().getClassLoader();
        Class[] interfaces = client.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ( intercept!= null) {
                    //可根据name值过滤方法
                    if (method.getName().equals(intercept.doIntercept())) {
                        System.out.println("intercept ");
                        return null;
                    }
                }
                if (before != null) {
                    before.doBefore();
                }
                Object result = method.invoke(client, args);
                if (after != null) {
                    after.doAfter();
                }
                return result;
            }
        };
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }


    public ProxyFactory setClient(T client) {
        this.client = client;
        return this;
    }

    public ProxyFactory setIntercept(Iintercept intercept) {
        this.intercept = intercept;
        return this;
    }

    public ProxyFactory setBefore(IBefore before) {
        this.before = before;
        return this;
    }

    public ProxyFactory setAfter(IAfter after) {
        this.after = after;
        return this;
    }

    public interface Iintercept {
        String doIntercept();
    }
    public interface IBefore {
        void doBefore();
    }
    public interface IAfter {
        void doAfter();
    }
}

