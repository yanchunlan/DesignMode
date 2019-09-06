package com.example.designmode.test.all._13_proxy._01;

/**
 * author:  ycl
 * date:  2019/09/06 11:45
 * desc:
 */
public class Benz implements ICar {
    @Override
    public void move() {
        System.out.println("move "+getClass().getSimpleName());
    }
}
