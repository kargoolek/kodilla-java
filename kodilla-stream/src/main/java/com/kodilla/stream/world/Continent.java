package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final String name;
    private final Set<Country> countries = new HashSet<>();


    public Continent(final String name) {
        this.name = name;
    }

    public void addCoountry(Country c){
        countries.add(c);
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }


}
