package com.example.designmode.test.all._02_factory._02;

public class BaiduMapView extends IMapView {

    @Override
    public void onStart() {
        System.out.println("百度地图onStart");
    }

    @Override
    public void onResume() {
        System.out.println("百度地图onResume");
    }

    @Override
    public void onDestory() {
        System.out.println("百度地图onDestory");
    }

}