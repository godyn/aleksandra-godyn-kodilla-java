package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //GIVEN
        User mark = new Millenials("Marc");
        User victor = new YGeneration("Victor");
        User amy = new ZGeneration("Amy");
        //WHEN
        String markPublisher = mark.sharePost();
        String victorPublisher = victor.sharePost();
        String amyPublisher = amy.sharePost();
        System.out.println("Mark: "+ markPublisher);
        System.out.println("Victor: "+ victorPublisher);
        System.out.println("Amy: " + amyPublisher);
        //THEN
        Assert.assertEquals("You use Facebook to public your posts.", markPublisher);
        Assert.assertEquals("You use Twitter to public your posts.", victorPublisher);
        Assert.assertEquals("You use Snapchat to public your posts.", amyPublisher);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //GIVEN
        User mark = new Millenials("Mark");
        //WHEN
        mark.setSocialPublisher(new SnapchatPublisher());
        String markPublisher = mark.sharePost();
        System.out.println("Mark update: " + markPublisher);
        //THEN
        Assert.assertEquals("You use Snapchat to public your posts.", markPublisher);

    }
}
