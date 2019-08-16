package com.example.designmode.test.all._11_strategy;

public class ZhiFuBaoManageFinancy implements IManageFinancy {

    @Override
    public float manageFinancy(int month, float money) {
        if (month == 6) {
            return money + money * 0.03f / 12 * 6;
        } else if (month == 12) {
            return money + money * 0.04f / 12 * 12;
        } else if (month == 24) {
            return money + money * 0.045f / 12 * 24;
        } else {
            throw new IllegalArgumentException("您输入的月份，没有对应的理财产品！");
        }
    }

}
