package com.example.designmode.test.all._05_prototype._03;

public abstract class AbsOrder  implements Cloneable {
    @Override
    protected AbsOrder clone() throws CloneNotSupportedException {
        return (AbsOrder) super.clone();
    }

    /**
     * 设置订单数量
     * @param number
     * @return
     */
    public abstract void setOrderNumber(int number);

    /**
     * 获取订单数量
     * @return
     */
    public abstract int getOrderNumber();
}