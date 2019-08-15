package com.example.designmode.test.all._02_factory;


import com.example.designmode.test.all._02_factory._03.AbsMapFactory;
import com.example.designmode.test.all._02_factory._03.BaiduMapFactory;
import com.example.designmode.test.all._02_factory._03.DefaultFactory;

/**
 * author:  ycl
 * date:  2019/08/13 11:03
 * desc:
 */
public class Main_Client {

    public static void main(String[] args) {
        // factory - 01
        // Android中简单工厂--BitmapFactory,XmlPullParserFactory,CertificateFactory
        /*IMapView mapView = MapViewFactory.getInstance().getMapView(MapViewFactory.MapType.Baidu);
        mapView.getView();
        mapView.setMapType(IMapView.MapType.MAP_TYPE_NONE);*/

        // factory - 02
        //  分析List集合、Set集合、Map集合 源码
        //  lterator：遍历集合工厂方法抽象
        //  Itr：具体的工厂实现类
       /*AbsMapFactory factory = DefaultMapFactory.getInstance();
        com.example.designmode.test.all._02_factory._02.
                BaiduMapView mapView = factory.createMapView(com.example.designmode.test.all._02_factory._02.
                BaiduMapView.class);
        mapView.onStart();*/

        // factory - 03
        // ActivityManager、ServiceManager --- 类似于我们通常所说的AbsMapFactory
        AbsMapFactory factory = DefaultFactory.creatProduct(BaiduMapFactory.class);
        factory.createMapView().onStart();
        factory.createMapLocation().location();
    }
}
