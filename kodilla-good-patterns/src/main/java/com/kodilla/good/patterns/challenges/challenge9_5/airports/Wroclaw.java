package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Wroclaw implements AirPort {
    private Location location;
    private String id, name;

    public Wroclaw() {
        this.location = new Location(51.107883,	17.038538);
        this.id = "PL_WRO";
        this.name = "Wrocław";
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
        final Wroclaw wroclaw = (Wroclaw) o;
        return Objects.equals(location, wroclaw.location) &&
                Objects.equals(id, wroclaw.id) &&
                Objects.equals(name, wroclaw.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
