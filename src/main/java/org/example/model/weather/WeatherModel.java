package org.example.model.weather;

public class WeatherModel {
    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private long visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private long timezone;
    private long id;
    private String name;
    private long cod;

    public WeatherModel(Coord coord, Weather[] weather, String base, Main main, long visibility, Wind wind, Clouds clouds, long dt, Sys sys, long timezone, long id, String name, long cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() { return coord; }
    public void setCoord(Coord value) { this.coord = value; }

    public Weather[] getWeather() { return weather; }
    public void setWeather(Weather[] value) { this.weather = value; }

    public String getBase() { return base; }
    public void setBase(String value) { this.base = value; }

    public Main getMain() { return main; }
    public void setMain(Main value) { this.main = value; }

    public long getVisibility() { return visibility; }
    public void setVisibility(long value) { this.visibility = value; }

    public Wind getWind() { return wind; }
    public void setWind(Wind value) { this.wind = value; }

    public Clouds getClouds() { return clouds; }
    public void setClouds(Clouds value) { this.clouds = value; }

    public long getDt() { return dt; }
    public void setDt(long value) { this.dt = value; }

    public Sys getSys() { return sys; }
    public void setSys(Sys value) { this.sys = value; }

    public long getTimezone() { return timezone; }
    public void setTimezone(long value) { this.timezone = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getCod() { return cod; }
    public void setCod(long value) { this.cod = value; }
}