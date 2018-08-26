package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Flight;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightsDatabase {

    public List<AirPort> getAllAirPorts() {
        List<AirPort> lst = new ArrayList<>();
        lst.add(new Krakow());
        lst.add(new Gdansk());
        lst.add(new Katowice());
        lst.add(new Wroclaw());
        lst.add(new Chicago());
        lst.add(new Berlin());
        return lst;
    }

    public List<Flight> getAllFlights() {
        List<Flight> lst = new ArrayList<Flight>();
        lst.add(new Flight(new Krakow(), new Gdansk(), Arrays.asList(new Wroclaw())));
        lst.add(new Flight(new Krakow(), new Chicago(), Arrays.asList(new Wroclaw(), new Berlin())));
        lst.add(new Flight(new Krakow(), new Chicago(), Arrays.asList(new Berlin())));
        lst.add(new Flight(new Katowice(), new Gdansk(), new ArrayList<>()));
        return lst;
    }

}
