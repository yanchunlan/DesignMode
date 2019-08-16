package com.example.designmode.test.all._12_iteration;

/**
*抽象迭代接口
*/
public interface Iterator <T>{

    /**
     * 是否有下一元素
     * @return
     */
    boolean hasNext();

    T next();
}