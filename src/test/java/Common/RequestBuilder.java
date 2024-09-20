package Common;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static Common.BasePaths.weather_App_baseURL;
import static Common.ContentType.json_contentType;
import static Common.PayLoadBuilder.*;
import static Common.QueryParameterBuilder.API_Key;
import static io.restassured.RestAssured.*;

public class RequestBuilder {

    public static String stationID;

    public static Response createNewWeatherResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();
        stationID = response.jsonPath().getString("ID");
        return response;
    }

    public static Response getWeatherStationResponse() {
        return given().
                when().queryParam("appid", API_Key).
                contentType(json_contentType).
                log().all().
                get(weather_App_baseURL + "/" + stationID).
                then().
                log().all().
                extract().response();
    }

    public static Response updateWeatherStationResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(updateWeatherStationObject()).
                contentType(json_contentType).
                log().all().put(weather_App_baseURL + "/" + stationID).then().
                log().all().
                extract().response();
        return response;
    }

    public static Response deleteWeatherStationResponse() {
        return given().
                when().queryParam("appid", API_Key).
                contentType(json_contentType).
                log().all().
                delete(weather_App_baseURL + "/" + stationID).
                then().
                log().all().
                extract().response();
    }

    public static Response createNewWeatherStationWithoutExternalIDResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherStationWithoutExternalIDObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();

        return response;
    }


    public static Response createNewWeatherStationWithoutNameResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherStationWithoutNameObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();

        return response;
    }

    public static Response createNewWeatherStationWithoutlatitudeResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherStationWithoutLatitudeObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();

        return response;
    }

    public static Response createNewWeatherStationWithoutLongitudeResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherStationWithoutLongitudeObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();

        return response;
    }

    public static Response createNewWeatherStationWithoutAlititudeResponse() {
        Response response = RestAssured.given().
                when().queryParam("appid", API_Key).
                body(createNewWeatherStationWithoutAltitudeObject()).
                contentType(json_contentType).
                log().all().post(weather_App_baseURL).then().
                log().all().
                extract().response();

        return response;
    }

}
