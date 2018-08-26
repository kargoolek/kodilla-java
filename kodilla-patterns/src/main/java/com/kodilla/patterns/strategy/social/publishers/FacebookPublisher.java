package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        String defaultShare = "Sharing post on Facebook...";
        System.out.println(defaultShare);
        return defaultShare;
    }

}