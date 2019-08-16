package com.example.designmode.test.all._09_observe;

public class Main_Client {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();


        //定义一个观察者
        Observer observer1 = new ConcreteObserver("观察者一");
        Observer observer2 = new ConcreteObserver("观察者二");
        Observer observer3 = new ConcreteObserver("观察者三");
        Observer observer4 = new ConcreteObserver("观察者四");

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.attach(observer4);

        subject.detach(observer2);

        subject.notifyObservers("小熊更新文章了");
    }
}