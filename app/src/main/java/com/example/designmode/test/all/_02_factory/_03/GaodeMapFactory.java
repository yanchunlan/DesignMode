package com.example.designmode.test.all._02_factory._03;

import com.example.designmode.test.all._02_factory._03.location.AbsMapLocation;
import com.example.designmode.test.all._02_factory._03.location.GaodeMapLocation;
import com.example.designmode.test.all._02_factory._03.navigation.AbsMapNavigation;
import com.example.designmode.test.all._02_factory._03.navigation.GaodeMapNavigation;
import com.example.designmode.test.all._02_factory._03.view.AbsMapView;
import com.example.designmode.test.all._02_factory._03.view.GaodeMapView;

public class GaodeMapFactory extends AbsMapFactory {

    @Override
    public AbsMapView createMapView() {
        return new GaodeMapView();
    }

    @Override
    public AbsMapNavigation createMapNavigation() {
        return new GaodeMapNavigation();
    }

    @Override
    public AbsMapLocation createMapLocation() {
        return new GaodeMapLocation();
    }

}