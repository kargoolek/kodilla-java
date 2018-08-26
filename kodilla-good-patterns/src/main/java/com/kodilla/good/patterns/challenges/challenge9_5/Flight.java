package com.kodilla.good.patterns.challenges.challenge9_5;

import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Flight {
    private AirPort fromCity, toCity;
    private List<AirPort> indirectCity;

    public Flight(final AirPort fromCity, final AirPort toCity, final List<AirPort> indirectCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.indirectCity = indirectCity;
    }

    public AirPort getFromCity() {
        return fromCity;
    }

    public void setFromCity(final AirPort fromCity) {
        this.fromCity = fromCity;
    }

    public AirPort getToCity() {
        return toCity;
    }

    public void setToCity(final AirPort toCity) {
        this.toCity = toCity;
    }

    public List<AirPort> getIndirectCity() {
        return indirectCity;
    }

    public void setIndirectCity(final List<AirPort> indirectCity) {
        this.indirectCity = indirectCity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Flight flight = (Flight) o;
        return Objects.equals(fromCity, flight.fromCity) &&
                Objects.equals(toCity, flight.toCity) &&
                Objects.equals(indirectCity, flight.indirectCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCity, toCity, indirectCity);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromCity=" + fromCity.getName() +
                ", toCity=" + toCity.getName() +
                ", indirectCity=" + indirectCity.stream().map(n -> n.getName()).collect(Collectors.joining(", ")) +
                '}';
    }
}
