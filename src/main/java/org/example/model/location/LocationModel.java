package org.example.model.location;

public class LocationModel {
    private String province;
    private String coordinates;

    public LocationModel(String province, String coordinates) {
        this.province = province;
        this.coordinates = coordinates;
    }

    public String getProvince() { return province; }
    public void setProvince(String value) { this.province = value; }

    public String getCoordinates() { return coordinates; }
    public void setCoordinates(String value) { this.coordinates = value; }
}


