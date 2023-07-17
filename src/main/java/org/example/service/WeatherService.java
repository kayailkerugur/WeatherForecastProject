package org.example.service;


import org.example.model.weather.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.charset.Charset;

public class WeatherService {
    String url;

    private double lat;
    private double lon;

    protected WeatherModel[] weatherList = new WeatherModel[100];

    public void fetchWeatherData(Double latitude, Double longitude) throws MalformedURLException {
        this.url = "https://api.openweathermap.org/data/2.5/weather?lat="+ latitude +"&lon="+ longitude +"&appid=API_KEY";
        this.lat = latitude;
        this.lon = longitude;
        try {
            JSONObject json = readJsonFromUrl(this.url);
            decode(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void decode(JSONObject object) throws JSONException {
        JSONArray weather = (JSONArray) object.get("weather");
        JSONObject main = (JSONObject) object.get("main");
        JSONObject wind = (JSONObject) object.get("wind");
        JSONObject clouds = (JSONObject) object.get("clouds");
        JSONObject sys = (JSONObject) object.get("sys");

        // MARK:
        Coord coord1 = new Coord(this.lon, this.lat);
        Weather[] weathers = new Weather[10];
        String base = (String) object.get("base");
        Main main1 = new Main((BigDecimal) main.get("temp"),(BigDecimal) main.get("feels_like"),(BigDecimal) main.get("temp_min"),(BigDecimal) main.get("temp_max"),(int) main.get("pressure"),(int) main.get("humidity"),(int) 0,0);
        int visibility = (int) object.get("visibility");
        Wind wind1 = new Wind((BigDecimal) wind.get("speed"),(int) wind.get("deg"),(float) 0.0);
        Clouds clouds1 = new Clouds((int) clouds.get("all"));
        int dt = (int) object.get("dt");
        Sys sys1 = new Sys(1,1,(String) sys.get("country"), (int) sys.get("sunrise"),(int) sys.get("sunset"));
        int timezone = (int) object.get("timezone");
        int id = (int) object.get("id");
        String name = (String) object.get("name");
        int cod = (int) object.get("cod");

        for (int i = 0; i < weather.length(); i++) {
            JSONObject listObject = weather.getJSONObject(i);
            weathers[i] = new Weather((int) listObject.get("id"), (String) listObject.get("main"), (String) listObject.get("description"), (String) listObject.get("icon"));
        }
        WeatherModel newModel;
        newModel = new WeatherModel(coord1,weathers,base,main1,visibility,wind1,clouds1,dt,sys1,timezone,id,name,cod);
        WeatherModel[] newWeatherList = new WeatherModel[weatherList.length + 1];
        System.arraycopy(weatherList, 0, newWeatherList, 0, weatherList.length);
        newWeatherList[weatherList.length] = newModel;
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return new JSONObject(jsonText);
        } finally {
            is.close();
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
