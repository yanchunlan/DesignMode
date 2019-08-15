package com.example.designmode.test.all._06_responsibility;

public class Handler2 extends Handler {
    @Override
    public void handle(AbstractRequest request) {
        System.out.println("handle2---->处理了对象" + request.getRequestLevel());
    }

    @Override
    public int getHandlerLevel() {
        return 2;
    }
}