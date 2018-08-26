package com.kodilla.good.patterns.challenges.challenge9_4;

import com.kodilla.good.patterns.challenges.challenge9_4.interfaces.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    List<Product> orderedItems = new ArrayList<>();

    public OrderRequest(final User user, final LocalDateTime orderTime, final List<Product> orderedItems) {
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

    public List<Product> getOrderedItems() {
        return orderedItems;
    }
}
