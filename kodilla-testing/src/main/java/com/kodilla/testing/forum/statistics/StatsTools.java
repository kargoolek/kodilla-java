package com.kodilla.testing.forum.statistics;

public class StatsTools{
    int usersCount, postsCount, commentsCount;
    double avPostsPerUser, avCommentsPerUser, avCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();
        if(usersCount != 0) {
            avPostsPerUser = postsCount / (double) usersCount;
            avCommentsPerUser = commentsCount / (double) usersCount;
        } else {
            avPostsPerUser = 0;
            avCommentsPerUser = 0;
        }

        if(postsCount != 0) avCommentsPerPost = commentsCount / (double) postsCount;
        else avCommentsPerPost = 0;

        showStatistics();
    }

    public void showStatistics(){
        System.out.println("FORUM STATS:");
        System.out.println("users count: "+getUsersCount());
        System.out.println("posts count: "+getPostsCount());
        System.out.println("comments count: "+getCommentsCount());
        System.out.println("per user posts count: "+String.format("%.2f",getAvPostsPerUser()));
        System.out.println("per user comments count: "+String.format("%.2f",getAvCommentsPerUser()));
        System.out.println("per post comments count: "+String.format("%.2f",getAvCommentsPerPost()));
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }
}