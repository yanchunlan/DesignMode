package com.example.designmode.test.all._10_state._02;

public class QQStateNotRestriction implements IQQState {
    @Override
    public void onStateChange(String message) {
        System.out.println("QQ加好友未受限......，"+message);
    }
}