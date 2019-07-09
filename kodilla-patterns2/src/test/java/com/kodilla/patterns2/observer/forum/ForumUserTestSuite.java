package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //GIVEN
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser annaDym = new ForumUser("Anna Dym");
        ForumUser alaKot = new ForumUser("Ala Kot");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(annaDym);
        javaHelpForum.registerObserver(alaKot);
        javaToolsForum.registerObserver(alaKot);
        //WHEN
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better use while loop in this case.");
        javaToolsForum.addPost("Problem with db mySQL");
        javaHelpForum.addPost("Why while is better?");
        javaToolsForum.addPost("Bad credential");
        //THEN
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, annaDym.getUpdateCount());
        Assert.assertEquals(5, alaKot.getUpdateCount());

    }
}
