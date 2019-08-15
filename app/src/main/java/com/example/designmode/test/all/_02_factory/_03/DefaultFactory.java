package com.example.designmode.test.all._02_factory._03;

public class DefaultFactory {

    //使用反射
    public static  <T extends AbsMapFactory> T creatProduct(Class<T> clz){
        AbsMapFactory factory = null;
        try {
            factory = (AbsMapFactory) Class.forName(clz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) factory;
    }
}