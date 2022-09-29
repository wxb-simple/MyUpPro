package com.simple.myapplication.strategy.exp1;

// 1、定义用于计算Tax的策略接口
public interface TaxStrategy {
    double CalculateTax(Parameters parameters);
}
