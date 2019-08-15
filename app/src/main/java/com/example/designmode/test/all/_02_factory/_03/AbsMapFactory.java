package com.example.designmode.test.all._02_factory._03;

import com.example.designmode.test.all._02_factory._03.location.AbsMapLocation;
import com.example.designmode.test.all._02_factory._03.navigation.AbsMapNavigation;
import com.example.designmode.test.all._02_factory._03.view.AbsMapView;

public abstract class AbsMapFactory {

    public abstract AbsMapView createMapView();

    public abstract AbsMapNavigation createMapNavigation();

    public abstract AbsMapLocation createMapLocation();
}