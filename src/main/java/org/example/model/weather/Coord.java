package org.example.model.weather;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Coord {
    private double lon;
    private double lat;

    public  Coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double value) {
        this.lon = value;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }
}
