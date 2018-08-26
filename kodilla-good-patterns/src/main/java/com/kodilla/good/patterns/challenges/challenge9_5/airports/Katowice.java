package com.kodilla.good.patterns.challenges.challenge9_5.airports;

import com.kodilla.good.patterns.challenges.challenge9_5.Location;
import com.kodilla.good.patterns.challenges.challenge9_5.interfaces.AirPort;

import java.util.Objects;

public class Katowice implements AirPort {
    private Location location;
    private String id, name;

    public Katowice() {
        this.location = new Location(50.270908,	19.039993);
        this.id = "PL_KTW";
        this.name = "Katowice";
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
        final Katowice katowice = (Katowice) o;
        return Objects.equals(location, katowice.location) &&
                Objects.equals(id, katowice.id) &&
                Objects.equals(name, katowice.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, id, name);
    }
}
