package com.example.designmode.test.all._05_prototype._03;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    /**
     * 订单拆分
     *
     * 需求：订单数量超过了100，我就拆分？
     *
     * @param order
     * @return
     */
    public static List<AbsOrder> getOrder(AbsOrder order) throws CloneNotSupportedException {
        List<AbsOrder> orderList = new ArrayList<AbsOrder>();
        //订单数量大于100就要进行拆分
        AbsOrder newOrder = null;
        while (order.getOrderNumber() > 100)
        {
            newOrder= order.clone();

            //拆分
            newOrder.setOrderNumber(100);
            orderList.add(newOrder);
            //改变原来的订单数量
            order.setOrderNumber(order.getOrderNumber()-100);
        }
        orderList.add(order);

        return orderList;
    }

}