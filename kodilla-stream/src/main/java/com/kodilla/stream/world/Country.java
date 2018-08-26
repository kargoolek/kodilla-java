package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Country implements PeopleQuantity {
    private final String name;
    private final BigDecimal peopleQuantity;
    private final Set<Country> countries = new HashSet<>();


    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public void addCountry(Country c){
        countries.add(c);
    }

    public Set<Country> getCountriesList() {
        return countries;
    }

    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
