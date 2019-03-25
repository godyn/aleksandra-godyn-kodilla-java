package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share(){
        return "You use Snapchat to public your posts.";
    }
}
