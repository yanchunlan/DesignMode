package com.example.designmode.test.all._10_state._02;

public class Main_Client {
    public static void main(String[] args) throws Exception {
        QQContext qqContext = new QQContext();
        for (int i = 0; i < 6; i++) {
            qqContext.addFriend("kpioneer", "Lisi" + i);
            qqContext.sendMessage("我是kpioneer");
        }
    }
}