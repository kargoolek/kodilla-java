package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Berlin implements AirPort {
    private Location location;
    private String id, name;

    public Berlin() {
        this.location = new Location(52.520008,	13.404954);
        this.id = "GE_BLN";
        this.name = "Berlin";
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
        final Berlin berlin = (Berlin) o;
        return Objects.equals(location, berlin.location) &&
                Objects.equals(id, berlin.id) &&
                Objects.equals(name, berlin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
