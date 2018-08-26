package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    SocialPublisher favouritePublisher;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserFavouritePublisher(SocialPublisher favouritePublisher) {
        this.favouritePublisher = favouritePublisher;
    }

    public String sharePost() {
        return favouritePublisher.share();
    }
}
