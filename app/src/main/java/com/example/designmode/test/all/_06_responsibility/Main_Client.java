package com.example.designmode.test.all._06_responsibility;

public class Main_Client {
    public static void main(String[] args) {

        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        Handler handler4 = new Handler4();

        // 拼装成链子
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
        handler3.nextHandler = handler4;


        AbstractRequest request = new Request1();
        handler1.handle(request);

        AbstractRequest request2 = new Request1();
        handler1.handle(request2);
    }
}