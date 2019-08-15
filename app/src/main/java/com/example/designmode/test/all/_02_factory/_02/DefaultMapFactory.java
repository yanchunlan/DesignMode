package com.example.designmode.test.all._02_factory._02;

public class DefaultMapFactory extends AbsMapFactory {

    private static DefaultMapFactory defaultMapFactory;

    private DefaultMapFactory() {
    }

    public static DefaultMapFactory getInstance(){
        if(defaultMapFactory == null){
            defaultMapFactory = new DefaultMapFactory();
        }
        return defaultMapFactory;
    }


    @Override
    public <T extends IMapView> T createMapView(Class<T> cClass) {
        try {
            // 反射 调用无参构造函数
          return   cClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}