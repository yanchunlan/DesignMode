package com.example.designmode.test.all._02_factory._01;

import android.view.View;

public class GaodeMapView implements IMapView {

    @Override
    public View getView() {
        System.out.println("调用了高德地图的getView");
        return null;
    }

    @Override
    public void setMapType(MapType mapType) {
        System.out.println("调用了高德地图的setMapType");
    }

}
