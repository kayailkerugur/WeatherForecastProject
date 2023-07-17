package org.example.model.weather;

public class Weather {
    private long id;
    private String main;
    private String description;
    private String icon;

    public Weather(long id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String value) {
        this.main = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String value) {
        this.icon = value;
    }
}
