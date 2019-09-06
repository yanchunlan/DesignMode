package com.example.designmode.test.all._13_proxy._01;

/**
 * author:  ycl
 * date:  2019/09/06 11:46
 * desc:  代理类，实际不做操作，真正的操作在 Benz
 */
public class BenzProxy implements ICar {

    private Benz benz;

    public BenzProxy() {
        benz = new Benz();
    }

    @Override
    public void move() {

        benz.move();

    }
}
