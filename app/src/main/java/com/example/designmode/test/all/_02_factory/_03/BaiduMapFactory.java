package com.example.designmode.test.all._02_factory._03;

import com.example.designmode.test.all._02_factory._03.location.AbsMapLocation;
import com.example.designmode.test.all._02_factory._03.location.BaiduMapLocation;
import com.example.designmode.test.all._02_factory._03.navigation.AbsMapNavigation;
import com.example.designmode.test.all._02_factory._03.navigation.BaiduMapNavigation;
import com.example.designmode.test.all._02_factory._03.view.AbsMapView;
import com.example.designmode.test.all._02_factory._03.view.BaiduMapView;

public class BaiduMapFactory extends AbsMapFactory {

    @Override
    public AbsMapView createMapView() {

        return  new BaiduMapView();
    }

    @Override
    public AbsMapNavigation createMapNavigation() {

        return new BaiduMapNavigation();
    }

    @Override
    public AbsMapLocation createMapLocation() {
        return new BaiduMapLocation();
    }

}