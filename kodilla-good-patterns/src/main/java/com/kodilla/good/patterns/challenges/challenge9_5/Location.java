package com.kodilla.good.patterns.challenges.challenge9_5;

public class Location {
    double latitude, longitude;

    public Location(final double latitude, final double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(final double latitude) {
        this.latitude = latitude;
    }
}
