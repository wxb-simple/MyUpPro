package com.simple.myapplication.strategy.exp1.allstrategys;

import com.simple.myapplication.strategy.exp1.Parameters;
import com.simple.myapplication.strategy.exp1.TaxStrategy;

// 2、Concrete Strategy （具体策略类）
// 支持以扩展的方式增加国家
public class CNTax implements TaxStrategy {
    @Override
    public double CalculateTax(Parameters parameters) {
        return 0;
    }
}