package com.example.designmode.test.all._04_builder._02;

public class WorkBuilder {
    private Room room = new Room();
    private RoomParams params = new RoomParams();

    public WorkBuilder makeWindow(String window){
        params.window = window;
        return this;
    }
    public WorkBuilder makeFloor(String floor){
        params.floor = floor;
        return this;
    }
    public WorkBuilder makeLamp(String lamp){
        params.lamp = lamp;
        return this;
    }
    /**
     * 隐藏构建过程
     *真正的构建者
     *  */
    public Room build(){
        room.apply(params);
        return room;
    }

   public class RoomParams{
       public String window;

       public String floor;

       public String lamp;
    }
}
