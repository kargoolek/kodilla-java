package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Chicago implements AirPort {
    private Location location;
    private String id, name;

    public Chicago() {
        this.location = new Location(41.881832,	-87.623177);
        this.id = "US_CHI";
        this.name = "Chicago";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Chicago chicago = (Chicago) o;
        return Objects.equals(location, chicago.location) &&
                Objects.equals(id, chicago.id) &&
                Objects.equals(name, chicago.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
