package com.example.designmode.test.all._09_observe._01;


import java.util.Observable;

/**
 * author:  ycl
 * date:  2019/09/06 11:11
 * desc:
 */
public class ObservableImpl2 extends Observable {
    private int number;

    public ObservableImpl2(int number) {
        this.number = number;
    }
}
