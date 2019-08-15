package com.example.designmode.test.all._02_factory._02;

//抽象
public abstract class AbsMapFactory {
    // 我只定义标准
    public abstract <T extends IMapView> T createMapView(Class<T> cClass);
}
