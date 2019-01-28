package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int userId;
    private String name;
    private char sex;
    private LocalDate birthday;
    private int postsNumber;

    public ForumUser(int userId, String name, char sex, LocalDate birthday, int postsNumber) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
