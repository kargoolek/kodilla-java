package com.kodilla.good.patterns.challenges.challenge9_5;

import com.kodilla.good.patterns.challenges.challenge9_5.airports.FlightsDatabase;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlightProcessor {
    private List<Flight> allAvailableFlights;

    public FindFlightProcessor() {
        FlightsDatabase db = new FlightsDatabase();
        this.allAvailableFlights = db.getAllFlights();
    }

    public List<Flight> process(Flight flight) {
        if(flight != null && flight.getFromCity() != null && flight.getToCity() != null && flight.getIndirectCity().size() > 0) {
            System.out.println("Looking for possible flights from "+flight.getFromCity().getName()+" to " +flight.getToCity().getName()+" with indirect destination in "
                    +flight.getIndirectCity().stream().map(AirPort::getName).collect(Collectors.joining(" or ")));
            return findAllFlightsFromToWithIndirect(flight);
        } else if(flight != null && flight.getFromCity() != null && flight.getToCity() != null && flight.getIndirectCity().size() == 0){
            System.out.println("Looking for possible flights from "+flight.getFromCity().getName()+" to "+flight.getToCity().getName()+"...");
            return findAllFlightsFromTo(flight);
        } else if(flight != null && flight.getFromCity() != null && flight.getToCity() == null && flight.getIndirectCity().size() == 0){
            System.out.println("Looking for possible destinations from "+flight.getFromCity().getName()+"...");
            return findAllFlightsFrom(flight.getFromCity());
        } else if(flight != null && flight.getFromCity() == null && flight.getToCity() != null && flight.getIndirectCity().size() == 0){
            System.out.println("Looking for possible departure airports to "+flight.getToCity().getName()+"...");
            return findAllFlightsTo(flight.getToCity());
        }
        return new ArrayList<>();
    }

    private List<Flight> findAllFlightsFromToWithIndirect(final Flight flight) {
        List<Flight> lst = findAllFlightsFromTo(flight);
        List<Flight> lstResult = new ArrayList<>();
        for(Flight f : lst){
            for(AirPort a : f.getIndirectCity()){
                for(AirPort aa : flight.getIndirectCity()){
                    if(aa.getId().equals(a.getId()) && !lstResult.contains(f)) {
                        lstResult.add(f);
                    }
                }
            }
        }
        return lstResult;
    }



    private List<Flight> findAllFlightsFromTo(final Flight flight) {
        List<Flight> lst = findAllFlightsFrom(flight.getFromCity());
        lst = lst.stream().filter(n -> n.getToCity().getId().equals(flight.getToCity().getId())).collect(Collectors.toList());
        return lst;
    }


    private List<Flight> findAllFlightsFrom(final AirPort airport) {
        return allAvailableFlights.stream().filter(n -> n.getFromCity().getId().equals(airport.getId())).collect(Collectors.toList());
    }

    private List<Flight> findAllFlightsTo(final AirPort airport) {
        return allAvailableFlights.stream().filter(n -> n.getToCity().getId().equals(airport.getId())).collect(Collectors.toList());
    }
}
