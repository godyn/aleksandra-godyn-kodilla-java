package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<ForumUser>();

    public Forum() {
        ForumUser user1 = new ForumUser(1, "Ania", 'F', LocalDate.of(1988, 12, 15), 24);
        ForumUser user2 = new ForumUser(2, "Tomek", 'M', LocalDate.of(2004, 10, 21), 8);
        ForumUser user3 = new ForumUser(3, "Wiktor", 'M', LocalDate.of(1985, 07, 30), 0);
        ForumUser user4 = new ForumUser(4, "Janek", 'M', LocalDate.of(1993, 01, 07), 32);
        ForumUser user5 = new ForumUser(5, "Bartek", 'M', LocalDate.of(1981, 03, 03), 51);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
    }

    public ArrayList<ForumUser> getUserList(){
        return new ArrayList<>(userList);

    }

}
