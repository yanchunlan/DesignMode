package com.example.designmode.test.all._13_proxy._03;

import com.example.designmode.test.all._13_proxy._01.Benz;
import com.example.designmode.test.all._13_proxy._01.ICar;

public class Main_Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setClient(new Benz())
                .setBefore(new ProxyFactory.IBefore() {
                    @Override
                    public void doBefore() {
                        System.out.println("doBefore");
                    }
                }).setAfter(new ProxyFactory.IAfter() {
            @Override
            public void doAfter() {
                System.out.println("doAfter");
            }
        }).setIntercept(new ProxyFactory.Iintercept() {
            @Override
            public String doIntercept() {
                return "move";
            }
        });
        ICar iCar = (ICar) proxyFactory.createProxy();
        iCar.move();

    }
}