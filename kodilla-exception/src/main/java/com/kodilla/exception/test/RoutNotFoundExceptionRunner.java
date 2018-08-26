package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RoutNotFoundExceptionRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("Luton", "Wrocław-Strachowice");
        try {
            findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport selected. Please make another selection.");
            e.printStackTrace();
        } finally {
            System.out.println("Searching finished in 0.00 seconds."); //TODO search time counter
        }
    }

    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapFlights = new HashMap<>();
        mapFlights.put("Okęcie", true);
        mapFlights.put("Pyrzowice", false);

        if(!mapFlights.containsKey(flight.arrivalAirport)) throw new RouteNotFoundException("Selected destination doesn't exist!");

        System.out.println("Searching finished. Details of selected airport '"+flight.arrivalAirport+"' below:");
        System.out.println("is selected airport available for this offer: "+mapFlights.get(flight.arrivalAirport)+".");
    }

}
