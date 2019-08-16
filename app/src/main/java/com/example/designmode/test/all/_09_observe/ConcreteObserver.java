package com.example.designmode.test.all._09_observe;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String content) {
         System.out.println(name+"： "+content);
    }
}