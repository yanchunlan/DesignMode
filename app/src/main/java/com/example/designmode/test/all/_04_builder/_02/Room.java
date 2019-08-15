package com.example.designmode.test.all._04_builder._02;


public class Room {
    private String window;

    private String floor;

    private String lamp;

    public Room apply(WorkBuilder.RoomParams params){
        window = params.window;
        floor = params.floor;
        lamp = params.floor;
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                ", lamp='" + lamp + '\'' +
                '}';
    }
}