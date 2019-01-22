package com.kodilla.testing.forum.statistics;

public class StatisticsPresentation {

    Statistics statistics;
    double postsPerUser;
    double commentsPerPost;
    double commentsPerUser;

    public StatisticsPresentation(Statistics statistics) {
        this.statistics = statistics;
    }


    public double[] calculateAdvStatistics(Statistics statistics){


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

        double[] results = {postsPerUser, commentsPerPost, commentsPerUser};
        return results;
    }

    public void showStatistics(){
        System.out.println("Statistic presentation:\nTotal number of users: " + statistics.usersNames().size()
                + "\nTotal number of posts: " + statistics.postsCount()
                + "\nTotal number of comments: "+ statistics.commentsCount()
                + "\nAverage number of comments per user: "+ calculateAdvStatistics(statistics)[2]
                + "\nAverage number of posts per user: " + calculateAdvStatistics(statistics)[0]
                + "\nAverage number of comments per post: "+ calculateAdvStatistics(statistics)[1]);
    }
}
