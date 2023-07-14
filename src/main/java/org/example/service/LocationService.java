package org.example.service;

import java.io.FileReader;
import java.io.IOException;
import org.example.model.location.LocationModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LocationService {

    protected LocationModel[] locationList = new LocationModel[82];

    public LocationService() {
        readJSON();
    }

    public void readJSON() {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader reader = new FileReader("/Users/ilkerkaya/Desktop/Code/Java/IKWeatherProject/src/main/java/org/example/service/location.json");
            Object obj = jsonParser.parse(reader);
            JSONArray locationList = (JSONArray) obj;
            locationList.forEach( emp -> decode( (JSONObject) emp ) );
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void decode(JSONObject object) {
        String province = (String) object.get("Province");
        String coordinates = (String) object.get("Coordinates");

        LocationModel newModel;
        newModel = new LocationModel(province,coordinates);

        LocationModel[] yeniLocationList = new LocationModel[locationList.length + 1];
        System.arraycopy(locationList, 0, yeniLocationList, 0, locationList.length);
        yeniLocationList[locationList.length] = newModel;

        this.locationList = yeniLocationList;
    }
}
