package com.example.designmode.test.all._02_factory._03.view;

public class GaodeMapView extends AbsMapView {

    @Override
    public void onStart() {
        System.out.println("高德地图调用了onStart");
    }

    @Override
    public void onResume() {
        System.out.println("高德地图调用了onResume");
    }

    @Override
    public void onDestory() {
        System.out.println("高德地图调用了onDestory");
    }

}