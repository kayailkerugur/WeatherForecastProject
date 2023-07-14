package org.example.service;

import org.example.model.weather.WeatherModel;

public class WeatherService {

    private String url = "https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid=API_KEY";

    protected WeatherModel[] weatherList;
}
