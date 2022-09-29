package com.simple.myapplication.strategy.exp1;

import com.simple.myapplication.strategy.exp1.allstrategys.CNTax;
import com.simple.myapplication.strategy.exp1.allstrategys.USTax;

public class Main {

    public static void main(String[] args) {
        SalesOrder salesOrderCN = new SalesOrder(new CNTax());
        salesOrderCN.calculateTax();

        SalesOrder salesOrderUS = new SalesOrder(new USTax());
        salesOrderUS.calculateTax();
    }
}
