package org.example.model.location;

public class District {
    private String district;
    private String coordinates;
    private Town[] towns;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String value) {
        this.district = value;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String value) {
        this.coordinates = value;
    }

    public Town[] getTowns() {
        return towns;
    }

    public void setTowns(Town[] value) {
        this.towns = value;
    }
}
