package org.example.model.weather;

import java.math.BigDecimal;

public class Main {
    private BigDecimal temp;
    private BigDecimal feelsLike;
    private BigDecimal tempMin;
    private BigDecimal tempMax;
    private long pressure;
    private long humidity;
    private long seaLevel;
    private long grndLevel;

    public Main(BigDecimal temp, BigDecimal feelsLike, BigDecimal tempMin, BigDecimal tempMax, long pressure, long humidity, long seaLevel, long grndLevel) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.seaLevel = seaLevel;
        this.grndLevel = grndLevel;
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal value) {
        this.temp = value;
    }

    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BigDecimal value) {
        this.feelsLike = value;
    }

    public BigDecimal getTempMin() {
        return tempMin;
    }

    public void setTempMin(BigDecimal value) {
        this.tempMin = value;
    }

    public BigDecimal getTempMax() {
        return tempMax;
    }

    public void setTempMax(BigDecimal value) {
        this.tempMax = value;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long value) {
        this.pressure = value;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long value) {
        this.humidity = value;
    }

    public long getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(long value) {
        this.seaLevel = value;
    }

    public long getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(long value) {
        this.grndLevel = value;
    }
}
