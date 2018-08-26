package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class World implements PeopleQuantity {
    private final Set<Continent> continents = new HashSet<>();

    public World() {
        //empty constructor
    }

    public void addContinent(Continent c){
        continents.add(c);
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return continents.stream().flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}