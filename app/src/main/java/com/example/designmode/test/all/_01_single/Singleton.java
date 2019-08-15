package com.example.designmode.test.all._01_single;

/**
 * author:  ycl
 * date:  2019/08/13 10:57
 * desc: 单列模式
 */
public class Singleton {
    // 01 饿汉
    /*private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }*/

    // 02 饿汉变种
    /*private static Singleton singleton = null;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }*/

    // 03 不加锁懒汉
    /*private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/

    // 04 枷锁懒汉
    /*private static volatile Singleton singleton = null;

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }*/

    // 05 双重校验锁
    /*private static volatile Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/

    // 06 静态内部类
    /*private static class Holder{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.singleton;
    }*/

    // 07 枚举
    /*public static class Resource {
    }
    public enum SomeThing {
        INSTANCE;
        private Resource instance;

        SomeThing() {
            this.instance = new Resource();
        }

        private Resource getInstance() {
            return instance;
        }
    }*/

    // 08 容器实现单列
    /*private static Map<String, Object> objMap = new HashMap<String, Object>();
    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }
    public static Object getService(String key) {
        return objMap.get(key);
    }*/
}

