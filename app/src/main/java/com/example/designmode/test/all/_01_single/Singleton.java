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
    /*
     * volatile 作用：
     * 可见性，每次从主内存读取
     * 禁止指令重排，解决sInstance分配内存，sInstance构造，并将sInstance对象指向分配的内存空间
     */
    /*private static volatile Singleton singleton = null;

    public static Singleton getInstance() {
        // 第一个判空作用：减少synchronized的执行次数，提高效率
        if (singleton == null) {
            synchronized (Singleton.class) {
                // 解决多线程第一个线程初始化完成，第二个线程获取锁不再初始化
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

