package com.example.designmode.test.all._02_factory._02;

public class GaodeMapView extends IMapView {

    @Override
    public void onStart() {
        System.out.println("高德地图onStart");
    }

    @Override
    public void onResume() {
        System.out.println("高德地图onResume");

    }

    @Override
    public void onDestory() {
        System.out.println("高德地图onResume");
    }

}