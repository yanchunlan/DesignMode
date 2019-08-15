package com.example.designmode.test.all._04_builder._01;

/**
 * 持有对房子的引用
 */
public class WorkBuilder implements Builder {
    Room room = new Room();
    @Override
    public void makeWindow() {
        room.setWindow("欧式窗户");
    }

    @Override
    public void makeFloor() {
        room.setFloor("日式地板");
    }

    @Override
    public Room build() {
        return room;
    }
}
