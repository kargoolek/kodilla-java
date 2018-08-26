package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        String defaultShare = "Sharing post on Snapchat...";
        System.out.println(defaultShare);
        return defaultShare;
    }

}
