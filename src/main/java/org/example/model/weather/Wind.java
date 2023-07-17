package org.example.model.weather;

import java.math.BigDecimal;

public class Wind {
    private BigDecimal speed;
    private long deg;
    private float gust;

    public Wind(BigDecimal speed, long deg, float gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal value) {
        this.speed = value;
    }

    public long getDeg() {
        return deg;
    }

    public void setDeg(long value) {
        this.deg = value;
    }

    public float getGust() {
        return gust;
    }

    public void setGust(float value) {
        this.gust = value;
    }
}
