package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Long orderId;
    private final Long userId;
    private ProductService productService;
    private final List<Item> items = new ArrayList<>();
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmited = false;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService = productService;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(productService.getPrice(item.getProductId()).multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(final boolean paid) {
        isPaid = paid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(final boolean verified) {
        isVerified = verified;
    }

    public boolean isSubmited() {
        return isSubmited;
    }

    public void setSubmited(final boolean submited) {
        isSubmited = submited;
    }
}
