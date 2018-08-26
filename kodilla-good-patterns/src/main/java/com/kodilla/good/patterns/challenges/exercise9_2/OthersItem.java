package com.kodilla.good.patterns.challenges.exercise9_2;

public class OthersItem implements Item {
    long itemID;

    public OthersItem(final long itemID) {
        this.itemID = itemID;
    }

    @Override
    public double calculatePrize() {
        return 0;
    }

    @Override
    public double countQuantity() {
        return 0;
    }

    @Override
    public long getItemID() {
        return itemID;
    }
}
