package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        String defaultShare = "Sharing post on Twitter...";
        System.out.println(defaultShare);
        return defaultShare;
    }

}
