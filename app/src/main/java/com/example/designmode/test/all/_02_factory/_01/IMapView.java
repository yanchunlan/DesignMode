package com.example.designmode.test.all._02_factory._01;

import android.view.View;

public interface IMapView {

    enum MapType {
        // 空白背景模式常量
        MAP_TYPE_NONE,
        // 普通地图模式常量
        MAP_TYPE_NORMAL,
        // 卫星图模式常量
        MAP_TYPE_SATELLITE
    }

    public View getView();

    public void setMapType(MapType mapType);
}