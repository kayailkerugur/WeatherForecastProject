package org.example.service;

import org.example.model.weather.WeatherModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

public class WeatherService {
    URL url;

    protected WeatherModel[] weatherList;

    public void fetchWeatherData(Double latitude, Double longitude) throws MalformedURLException {
        this.url = new URL("https://api.openweathermap.org/data/2.5/weather?lat="+ latitude +"&lon="+ longitude +"&appid=API_KEY");

        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
