package com.kodilla.good.patterns.challenges.challenge9_5;

import com.kodilla.good.patterns.challenges.challenge9_5.airports.*;

import java.util.*;

public class WebAskReceiver {
    ArrayDeque<Flight> asksQueue;

    public ArrayDeque getNewRequests(){
        ArrayDeque<Flight> asksQueue = new ArrayDeque<Flight>();
        asksQueue.offer(new Flight(new Krakow(), new Chicago(), Collections.EMPTY_LIST));
        asksQueue.offer(new Flight(new Krakow(), null, Collections.EMPTY_LIST));
        asksQueue.offer(new Flight(null, new Gdansk(), Collections.EMPTY_LIST));
        asksQueue.offer(new Flight(new Krakow(), new Chicago(), Arrays.asList(new Wroclaw())));
        asksQueue.offer(new Flight(new Krakow(), new Chicago(), Arrays.asList(new Wroclaw(), new Berlin())));
        asksQueue.offer(new Flight(new Gdansk(), new Krakow(), Arrays.asList(new Wroclaw())));
        return asksQueue;
    }

}
