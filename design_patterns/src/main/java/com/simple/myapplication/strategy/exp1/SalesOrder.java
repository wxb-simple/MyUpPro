package com.simple.myapplication.strategy.exp1;

// 3、Strategy Context
public class SalesOrder {

    TaxStrategy taxStrategy; // 持有策略接口引用，声明为接口类型，而不是具体类

    // 更好的方法是使用工厂模式创建策略对象
    public SalesOrder(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
    // executeStrategy
    public double calculateTax(){
        // ...

        // parameters 不同国家计算税需要的信息,需要根据不同国家而改变，为了程序完整性简单 new了个对象
        double val = taxStrategy.CalculateTax(new Parameters());

        // ...

        return val;
    }
}
