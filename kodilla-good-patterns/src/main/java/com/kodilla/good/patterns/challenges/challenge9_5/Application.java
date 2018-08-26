package com.kodilla.good.patterns.challenges.challenge9_5;


import com.kodilla.good.patterns.challenges.challenge9_5.airports.FlightsDatabase;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        List<Flight> flights = flightsDatabase.getAllFlights();
        System.out.println("List of all available flights:");
        flights.stream().forEach(System.out::println);


        System.out.println();
        System.out.println("Receiving new ask...");
        WebAskReceiver askReceiver = new WebAskReceiver();
        ArrayDeque<Flight> requests = askReceiver.getNewRequests();

        FindFlightProcessor productOrderProcessor = new FindFlightProcessor();
        while(!requests.isEmpty()) {
            List<Flight> lst = productOrderProcessor.process(requests.pollFirst());
            if(lst.isEmpty()){
                System.out.println("Nothing has been found for above request! :(");
            } else {
                System.out.println("Query finished. Results below:");
                lst.forEach(System.out::println);
            }
            System.out.println("-----------------------------");
        }
    }
}
