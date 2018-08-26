package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        System.out.println("\nTESTING DEFAULT SET\n");

        //Given
        User userMillenials = new Millenials("Millenials user");
        User userYGeneration = new YGeneration("YGeneration user");
        User userZGeneration = new ZGeneration("ZGeneration user");
        String facebookShare = "Sharing post on Facebook...";
        String twitterShare = "Sharing post on Twitter...";
        String snapchatShare = "Sharing post on Snapchat...";

        //When
        System.out.println("Millenials default share:");
        String millenialsShare = userMillenials.sharePost();
        System.out.println("YGeneration default share:");
        String yGenerationShare = userYGeneration.sharePost();
        System.out.println("ZGeneration default share:");
        String zGenerationShare = userZGeneration.sharePost();

        //Then
        Assert.assertEquals(millenialsShare, facebookShare);
        Assert.assertEquals(yGenerationShare, twitterShare);
        Assert.assertEquals(zGenerationShare, snapchatShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        System.out.println("\nTESTING PUBLISHER SWITCHING\n");

        //Given
        User userMillenials = new Millenials("Millenials user");
        String twitterShare = "Sharing post on Twitter...";

        //When
        System.out.println("Millenials user default share:");
        userMillenials.sharePost();
        System.out.println("Millenials user changed publisher to Snapchat");
        userMillenials.setUserFavouritePublisher(new SnapchatPublisher());
        userMillenials.sharePost();
        System.out.println("Millenials user changed publisher to Twitter");
        userMillenials.setUserFavouritePublisher(new TwitterPublisher());
        userMillenials.sharePost();

        Assert.assertEquals(twitterShare, userMillenials.sharePost());
    }

}
