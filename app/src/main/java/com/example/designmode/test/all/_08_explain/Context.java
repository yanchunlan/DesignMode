package com.example.designmode.test.all._08_explain;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable,Integer> map = new HashMap<Variable,Integer>();

    public void assign(Variable var , int value){
        map.put(var, new Integer(value));
    }

    public int lookup(Variable var) throws IllegalArgumentException{
        Integer value = map.get(var);
        if(value == null){
            throw new IllegalArgumentException();
        }
        return value.intValue();
    }
}
