package com.example.designmode.test.all._09_observe._01;

import java.util.Observable;
import java.util.Observer;

/**
 * author:  ycl
 * date:  2019/09/06 11:14
 * desc:
 */
public class ObserverImpl2 implements Observer {
    private int number;

    public ObserverImpl2(int number) {
        this.number = number;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(getClass().getSimpleName()+" observable: "+observable.toString()+ " o "+o);
    }
}
