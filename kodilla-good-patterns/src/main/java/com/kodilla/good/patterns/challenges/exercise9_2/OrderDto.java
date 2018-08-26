package com.kodilla.good.patterns.challenges.exercise9_2;

public class OrderDto {
    public User user;
    public boolean isOrderSuccess;

    public OrderDto(final User user, final boolean isOrderSuccess) {
        this.user = user;
        this.isOrderSuccess = isOrderSuccess;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderSuccess() {
        return isOrderSuccess;
    }
}
