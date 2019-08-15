package com.example.designmode.test.all._07_command._01;

import java.io.Serializable;

public class Receiver implements Serializable {

    public void onLeft() {
        System.out.println("向左");
    }

    public void onRight() {
        System.out.println("向右");
    }

    public void onBottom() {
        System.out.println("向下");
    }

    public void onTransformation() {
        System.out.println("变形");
    }
}