package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Krakow implements AirPort {
    private Location location;
    private String id, name;

    public Krakow() {
        this.location = new Location(50.049683, 19.944544);
        this.id = "PL_KRK";
        this.name = "Kraków";
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
        final Krakow krakow = (Krakow) o;
        return Objects.equals(location, krakow.location) &&
                Objects.equals(id, krakow.id) &&
                Objects.equals(name, krakow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
