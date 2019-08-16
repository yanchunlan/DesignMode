package com.example.designmode.test.all._11_strategy;

public class YouLiWangManageFinancy implements IManageFinancy {

    @Override
    public float manageFinancy(int month, float money) {
        if (month == 3) {
            return money + money * 0.07f / 12 * 3;
        } else if (month == 6) {
            return money + money * 0.08f / 12 * 6;
        } else if (month == 12) {
            return money + money * 0.095f / 12 * 12;
        } else if (month == 24) {
            return money + money * 0.105f / 12 * 24;
        } else {
            throw new IllegalArgumentException("您输入的月份，没有对应的理财产品！");
        }
    }

}