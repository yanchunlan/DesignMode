package com.example.designmode.test.all._05_prototype;

import com.example.designmode.test.all._05_prototype._03.AbsOrder;
import com.example.designmode.test.all._05_prototype._03.EnterpriseOrder;
import com.example.designmode.test.all._05_prototype._03.OrderService;

import java.util.List;

public class Main_Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 02
        /*PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderName("手机");
        personalOrder.setOrderUserName("kpioneer");
        personalOrder.setOrderNumber(999);


        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderName("电脑");
        enterpriseOrder.setOrderCompany("haocai");
        enterpriseOrder.setOrderNumber(666);
        //将来随着不断版本迭代，订单种类会不断增加



        // 获取拆分后的订单
        // 结果是拆分为10个订单
        List<IOrder> order = OrderService.getOrder(enterpriseOrder);
        for (IOrder iOrder : order) {
            System.out.println("订单信息:" + iOrder.toString());
        }*/

        // 03 利用android clone接口实现浅拷贝
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderName("电脑");
        enterpriseOrder.setOrderCompany("haocai");
        enterpriseOrder.setOrderNumber(666);
        //将来随着不断版本迭代，订单种类会不断增加

        // 获取拆分后的订单
        // 结果是拆分为10个订单
        List<AbsOrder> order = OrderService.getOrder(enterpriseOrder);
        for (AbsOrder iOrder : order) {
            System.out.println("订单信息:" + iOrder.toString());
        }


    }
}