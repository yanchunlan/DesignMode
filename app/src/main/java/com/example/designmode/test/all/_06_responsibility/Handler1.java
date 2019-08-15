package com.example.designmode.test.all._06_responsibility;

/**
 * 具体处理者
 */
public class Handler1 extends Handler {
    @Override
    public void handle(AbstractRequest request) {
        System.out.println("handle1---->处理了对象" + request.getRequestLevel());
    }

    @Override
    public int getHandlerLevel() {
        return 1;
    }
}






