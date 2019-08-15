package com.example.designmode.test.all._04_builder._01;

/**
 * 抽象建造者
 */
public interface Builder {
    public void makeWindow();

    public void makeFloor();

    public Room build();

}