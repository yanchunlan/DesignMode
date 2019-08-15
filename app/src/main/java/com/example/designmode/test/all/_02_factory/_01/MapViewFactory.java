package com.example.designmode.test.all._02_factory._01;

public class MapViewFactory {
    
    public enum MapType{
        Baidu,
        Gaode
    }
    
    //使用上一节课的内容---单例模式
    //懒汉式
    private static MapViewFactory mapViewFactory;
    
    private MapViewFactory(){
        
    }
    
    public static MapViewFactory getInstance(){
        if(mapViewFactory == null){
            mapViewFactory = new MapViewFactory();
        }
        return mapViewFactory;
    }
    
    public IMapView getMapView(MapType mapType){
        IMapView mapView = null;
        switch (mapType) {
        case Baidu:
            mapView = new BaiduMapView();
            break;
        case Gaode:
            mapView = new GaodeMapView();
            break;
        }
        return mapView;
    }
    
}