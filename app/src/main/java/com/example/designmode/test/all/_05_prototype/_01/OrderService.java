package com.example.designmode.test.all._05_prototype._01;

import com.example.designmode.test.all._05_prototype._02.EnterpriseOrder;
import com.example.designmode.test.all._05_prototype._02.IOrder;
import com.example.designmode.test.all._05_prototype._02.PersonalOrder;

import java.util.ArrayList;
import java.util.List;

/**
 *  反面教材
 *
 *  将来随着不断版本迭代，订单种类会不断增加，这样写导致if 、else if语句也随之增加
 *  造成可读性差、耦合度高的问题
 */

public class OrderService {
    /**
     * 订单拆分
     *
     * 需求：订单数量超过了100，我就拆分？
     *
     * @param order
     * @return
     */
    public static List<IOrder> getOrder(IOrder order){
        List<IOrder> orderList = new ArrayList<IOrder>();
        //订单数量大于100就要进行拆分
        IOrder newOrder = null;
        while (order.getOrderNumber() > 100)
        {
            if(order instanceof PersonalOrder)
            {
                PersonalOrder personalOrder = (PersonalOrder) order;
                PersonalOrder newPersonalOrder = new PersonalOrder();
                newPersonalOrder.setOrderName(personalOrder.getOrderName());
                newPersonalOrder.setOrderUserName(personalOrder.getOrderUserName());
               // newPersonalOrder.setOrderNumber(100);
                newOrder = newPersonalOrder;
                //例如：在android当中，我们经常使用Intent，一般情况都会new Intent();
            }else if(order instanceof EnterpriseOrder){
                EnterpriseOrder enterpriseOrder = (EnterpriseOrder) order;
                EnterpriseOrder newEnterpriseOrder = new EnterpriseOrder();
                newEnterpriseOrder.setOrderName(enterpriseOrder.getOrderName());
                newEnterpriseOrder.setOrderCompany(enterpriseOrder
                        .getOrderCompany());
                newOrder = newEnterpriseOrder;
            }
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
