package com.example.designmode.test.all._12_iteration;

/**
 * 容器的接口
 */
public interface Aggregate<T> {
    void add(T t);

    void remove(T t);

    Iterator<T> iterator();
}
