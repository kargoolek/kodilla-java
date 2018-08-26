package com.kodilla.good.patterns.challenges.exercise9_2;

public class SMSService implements InfoService {

    @Override
    public void notify(final User user) {
        System.out.println("SMS sent to "+user.getNick()+" ("+user.getMobileContact()+")");
    }
}
