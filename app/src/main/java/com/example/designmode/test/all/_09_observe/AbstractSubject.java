package com.example.designmode.test.all._09_observe;

import java.util.ArrayList;
import java.util.List;

public class AbstractSubject {

    /**
     * 保存注册观察者
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        list.add(observer);
    }

    public void detach(Observer observer){
        list.remove(observer);
    }

    public void notifyObservers(String content){
        for(Observer observer :list ){
            observer.update(content);
        }
    }
}