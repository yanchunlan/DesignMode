package com.example.designmode.test.all._09_observe._01;


import java.util.Observable;

/**
 * author:  ycl
 * date:  2019/09/06 11:11
 * desc:
 */
public class ObservableImpl1 extends Observable {
    private int number;

    public ObservableImpl1(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
        setChanged();
        notifyObservers(number);
    }

    @Override
    public String toString() {
        return "ObservableImpl1{" +
                "number=" + number +
                '}';
    }
}
