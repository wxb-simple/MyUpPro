package com.simple.myapplication.strategy.exp2;

import java.math.BigDecimal;

public interface TaxStrategy {

    BigDecimal calculateTax(BigDecimal input);
}
