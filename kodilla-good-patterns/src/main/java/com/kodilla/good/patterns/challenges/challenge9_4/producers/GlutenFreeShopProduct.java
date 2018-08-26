package com.kodilla.good.patterns.challenges.challenge9_4.producers;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;

import java.math.BigDecimal;
import java.util.Objects;

public class GlutenFreeShopProduct implements Product {
    private long itemID;
    private String itemName, itemQuantityType;
    private BigDecimal prize;
    private boolean isAvailableNow;
    private double itemQuantity;

    public GlutenFreeShopProduct(final long itemID, final double itemQuantity) {
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
    }

    public GlutenFreeShopProduct(final long itemID, final String itemName, final boolean isAvailableNow, final double itemQuantity, final String itemQuantityType, final BigDecimal prize) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemQuantityType = itemQuantityType;
        this.prize = prize;
        this.isAvailableNow = isAvailableNow;
        this.itemQuantity = itemQuantity;
    }

    @Override
    public long getItemID() {
        return itemID;
    }

    public void setItemID(final long itemID) {
        this.itemID = itemID;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public boolean isAvailableNow() {
        return isAvailableNow;
    }

    public void setAvailability(boolean isAvailableNow){
        this.isAvailableNow = isAvailableNow;
    }

    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getItemQuantityUnit() {
        return itemQuantityType;
    }

    public void setItemQuantityType(final String itemQuantityType) {
        this.itemQuantityType = itemQuantityType;
    }

    @Override
    public BigDecimal getPrizePerUnit() {
        return prize;
    }

    public void setPrize(final BigDecimal prize) {
        this.prize = prize;
    }


    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(final double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    @Override
    public int hashCode() {
        return Objects.hash(String.valueOf(itemID).substring(0,2));
    }
}
