package com.example.designmode.test.all._11_strategy;

public class Main_Client {
    public static void main(String[] args) {

        IManageFinancy manageFinancy = new ZhiFuBaoManageFinancy();
        ManangeFinancyContext financyContext = new ManangeFinancyContext(
                manageFinancy);
        float money = financyContext.manageFinancy(12, 10000);
        System.out.println("理财之后的金额：" + money);
    }
}