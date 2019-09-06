package com.example.designmode.test.all._09_observe._01;

public class Main_Client {
    public static void main(String[] args) {

        // 事实证明，父类的集合，继承了子类不会影响子类的一切
        ObservableImpl1 observableImpl1 = new ObservableImpl1(1);
        ObservableImpl2 observableImpl2 = new ObservableImpl2(2);

        ObserverImpl1 observerImpl1 = new ObserverImpl1(11);
        ObserverImpl2 observerImpl2 = new ObserverImpl2(22);

        observableImpl1.addObserver(observerImpl1);
        observableImpl1.addObserver(observerImpl2);

        observableImpl1.setNumber(6);

        System.out.printf(" "+observableImpl1.countObservers());
        System.out.printf(" "+observableImpl2.countObservers());
    }
}