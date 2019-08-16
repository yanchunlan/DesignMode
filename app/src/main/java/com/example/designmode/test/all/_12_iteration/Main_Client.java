package com.example.designmode.test.all._12_iteration;

public class Main_Client {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("aaaa");
        aggregate.add("bbbb");
        aggregate.add("cccc");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}