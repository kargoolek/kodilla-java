package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Gdansk implements AirPort {
    private Location location;
    private String id, name;

    public Gdansk() {
        this.location = new Location(54.372158,	18.638306);
        this.id = "PL_GDA";
        this.name = "Gdańsk";
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
        final Gdansk gdansk = (Gdansk) o;
        return Objects.equals(location, gdansk.location) &&
                Objects.equals(id, gdansk.id) &&
                Objects.equals(name, gdansk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
