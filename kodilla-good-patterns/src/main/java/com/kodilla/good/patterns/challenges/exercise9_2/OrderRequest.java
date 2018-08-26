package com.kodilla.good.patterns.challenges.exercise9_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    List<Item> orderedItems = new ArrayList<>();

    public OrderRequest(final User user, final LocalDateTime orderTime, final List<Item> orderedItems) {
        this.user = user;
        this.orderTime = orderTime;
        this.orderedItems = orderedItems;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public List<Item> getOrderedItems() {
        return orderedItems;
    }
}
