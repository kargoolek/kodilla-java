package com.kodilla.good.patterns.challenges.challenge9_4.interfaces;

import java.math.BigDecimal;

public interface Product {
    long getItemID();
    String getItemName();
    boolean isAvailableNow();
    double getItemQuantity();
    String getItemQuantityUnit();
    BigDecimal getPrizePerUnit();
}
