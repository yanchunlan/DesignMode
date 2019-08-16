package com.example.designmode.test.all._11_strategy;

public class PingAnManageFinanacy implements IManageFinancy {

    @Override
    public float manageFinancy(int month, float money) {
        if (month == 6) {
            return money + money * 0.08f / 12 * 6;
        } else if (month == 12) {
            return money + money * 0.09f / 12 * 12;
        } else {
            throw new IllegalArgumentException("亲您好，没有你要的理财产品！");
        }
    }

}