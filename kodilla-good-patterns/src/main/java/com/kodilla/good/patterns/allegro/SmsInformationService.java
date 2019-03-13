package com.kodilla.good.patterns.allegro;

public class SmsInformationService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Text message sent to the user's phone.");
    }
}
