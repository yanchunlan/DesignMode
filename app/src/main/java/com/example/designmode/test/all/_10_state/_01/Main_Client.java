package com.example.designmode.test.all._10_state._01;

public class Main_Client {
    public static void main(String[] args) {

        Context context = new Context();

        //设置电梯当前状态
        context.setLiftState(Context.closeingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}