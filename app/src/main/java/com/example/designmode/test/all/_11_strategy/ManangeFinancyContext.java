package com.example.designmode.test.all._11_strategy;

public class ManangeFinancyContext {
    
    private IManageFinancy manageFinancy;
    
    public ManangeFinancyContext(IManageFinancy manageFinancy) {
        this.manageFinancy = manageFinancy;
    }
    
    public float manageFinancy(int month,float money){
        return this.manageFinancy.manageFinancy(month, money);
    }
    
}
