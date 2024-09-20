package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static Common.GenerateTestData.*;

public class PayLoadBuilder {

    public static JSONObject createNewWeatherObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", 65.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 12.34);

        return jsonObject;
    }

    public static JSONObject updateWeatherStationObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", 56.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 122.34);

        return jsonObject;
    }

    public static JSONObject createNewWeatherStationWithoutExternalIDObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", 56.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 122.34);

        return jsonObject;
    }

    public static JSONObject createNewWeatherStationWithoutNameObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", "");
        jsonObject.put("latitude", 56.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 122.34);

        return jsonObject;
    }

    public static JSONObject createNewWeatherStationWithoutLatitudeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", "");
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 122.34);

        return jsonObject;
    }

    public static JSONObject createNewWeatherStationWithoutLongitudeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", 56.87);
        jsonObject.put("longitude", "");
        jsonObject.put("altitude", 122.34);

        return jsonObject;
    }

    public static JSONObject createNewWeatherStationWithoutAltitudeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", cityName);
        jsonObject.put("latitude", 56.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", "");

        return jsonObject;
    }
}
