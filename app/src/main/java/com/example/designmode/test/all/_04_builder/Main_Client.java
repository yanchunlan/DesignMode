package com.example.designmode.test.all._04_builder;

public class Main_Client {
    public static void main(String[] args) {
        // 01 Product本身暴露了产品构建过程不合理
       /* Builder builder = new WorkBuilder();
        Designer designer = new Designer();
        Room room = designer.build(builder);
        System.out.printf("room: " + room.toString());*/

        // 02
        //隐藏了构建过程合理
        // 建造者典型例子是AlertDialog
        com.example.designmode.test.all._04_builder._02.
                Room room = new com.example.designmode.test.all._04_builder._02
                .WorkBuilder()
                .makeFloor("日式地板")
                .makeWindow("欧式窗户")
                .makeLamp("中式吊灯")
                .build() ;
        System.out.println(room.toString());


    }
}