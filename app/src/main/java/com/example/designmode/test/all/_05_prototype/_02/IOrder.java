package com.example.designmode.test.all._05_prototype._02;

public interface IOrder extends IOrderClonable {
    /**
     * 设置订单数量
     * @param number
     * @return
     */
    public void setOrderNumber(int number);

    /**
     * 获取订单数量
     * @return
     */
    public int getOrderNumber();
}