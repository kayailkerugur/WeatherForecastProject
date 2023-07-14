package org.example;

import org.example.service.LocationService;
import org.example.service.WeatherService;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        LocationService locationService = new LocationService();
        WeatherService weatherService = new WeatherService();
        try {
            weatherService.fetchWeatherData(37.0000, 35.3250);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}