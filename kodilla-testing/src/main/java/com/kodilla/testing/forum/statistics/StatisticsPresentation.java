package com.kodilla.testing.forum.statistics;

public class StatisticsPresentation {

    Statistics statistics;
    double postsPerUser;
    double commentsPerPost;
    double commentsPerUser;

    public StatisticsPresentation(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public void calculateAdvStatistics(Statistics statistics){


        if(statistics.usersNames().size()==0 || statistics.postsCount()==0 ){
            postsPerUser = 0;
            commentsPerUser = 0;
            commentsPerPost =0;
        }
        else {
            postsPerUser = (statistics.postsCount() / statistics.usersNames().size());
            commentsPerUser = (statistics.commentsCount() / statistics.usersNames().size());
            commentsPerPost = (statistics.commentsCount() / statistics.postsCount());
        }

    }

    public void showStatistics(){
        System.out.println("Statistic presentation:\nTotal number of users: " + statistics.usersNames().size()
                + "\nTotal number of posts: " + statistics.postsCount()
                + "\nTotal number of comments: "+ statistics.commentsCount()
                + "\nAverage number of comments per user: "+ getCommentsPerUser()
                + "\nAverage number of posts per user: " + getPostsPerUser()
                + "\nAverage number of comments per post: "+ getCommentsPerPost());
    }
}
