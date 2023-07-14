package org.example.model.location;

public class Town {
    private String town;
    private String zipCode;
    private String[] neighbourhoods;

    public String getTown() {
        return town;
    }

    public void setTown(String value) {
        this.town = value;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String value) {
        this.zipCode = value;
    }

    public String[] getNeighbourhoods() {
        return neighbourhoods;
    }

    public void setNeighbourhoods(String[] value) {
        this.neighbourhoods = value;
    }
}
