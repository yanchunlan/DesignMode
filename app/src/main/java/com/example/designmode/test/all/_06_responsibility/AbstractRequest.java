package com.example.designmode.test.all._06_responsibility;

public abstract class AbstractRequest {
    private Object object;
    public  Object getContent(){
        return object;
    }
    public abstract int getRequestLevel();
}