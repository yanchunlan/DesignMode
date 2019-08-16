package com.example.designmode.test.all._10_state._02;

public class QQStateRestriction implements IQQState {
    @Override
    public void onStateChange(String message) {
        System.out.println("QQ加好友受限，不能再加好友......");
    }
}