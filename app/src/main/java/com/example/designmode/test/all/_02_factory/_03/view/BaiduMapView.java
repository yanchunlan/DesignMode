package com.example.designmode.test.all._02_factory._03.view;

public class BaiduMapView extends AbsMapView {

    
    @Override
    public void onStart() {
        System.out.println("百度地图调用了onStart");
    }

    @Override
    public void onResume() {
        System.out.println("百度地图调用了onResume");
    }

    @Override
    public void onDestory() {
        System.out.println("百度地图调用了onDestory");
    }

}