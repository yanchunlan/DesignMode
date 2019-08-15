package com.example.designmode.test.all._04_builder._01;
/**
 * 设计者(指导者)
 *
 * 他知道 房屋怎么设计
 * 他肯定对 工人所具备的能力有所理解
 */
public class Designer {
    public Room build(Builder builder){
        builder.makeFloor();
        builder.makeWindow();
        return builder.build();
    }
}