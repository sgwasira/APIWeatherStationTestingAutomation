package Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.RequestBuilder.*;

@Test
@Feature("WeatherAPP")
@Story("New Station")
public class WeatherAPITests {

    public void createNewWeatherStationTest() {
        createNewWeatherResponse().
                then().
                assertThat().
                statusCode(201).
                log().all().
                extract().response();

    }

    @Test(priority = 1)
    public void getWeatherStationTest() {
        getWeatherStationResponse().
                then().
                assertThat().
                statusCode(200).
                log().all().
                extract().response();
    }

    @Test(priority = 2)
    public void updateWeatherStationTest() {
        updateWeatherStationResponse().
                then().
                assertThat().
                statusCode(200).
                log().all().
                extract().response();
    }

    @Test(priority = 3)
    public void deleteWeatherStationTest() {
        deleteWeatherStationResponse().
                then().
                assertThat().
                statusCode(204).
                log().all().
                extract().response();
    }

    @Test(dependsOnMethods = "deleteWeatherStationTest")
    public void createNewWeatherStationWithoutCityNameNegativeTest() {
        createNewWeatherStationWithoutNameResponse().
                then().
                assertThat().
                statusCode(400).
                log().all().
                extract().response();
    }

    @Test(dependsOnMethods = "deleteWeatherStationTest")
    public void createNewWeatherStationWithoutLongitudeNegativeTest() {
        createNewWeatherStationWithoutLongitudeResponse().
                then().
                assertThat().
                statusCode(400).
                log().all().
                extract().response();
    }
    @Test(dependsOnMethods = "deleteWeatherStationTest")
    public void createNewWeatherStationWithoutLatitudeNegativeTest() {
        createNewWeatherStationWithoutlatitudeResponse().
                then().
                assertThat().
                statusCode(400).
                log().all().
                extract().response();
    }

    @Test(dependsOnMethods = "deleteWeatherStationTest")
    public void createNewWeatherStationWithoutExternalIDNegativeTest() {
        createNewWeatherStationWithoutExternalIDResponse().
                then().
                assertThat().
                statusCode(400).
                log().all().
                extract().response();
    }


    @Test(dependsOnMethods = "deleteWeatherStationTest")
    public void createNewWeatherStationWithoutAlititudeNegativeTest() {
        createNewWeatherStationWithoutAlititudeResponse().
                then().
                assertThat().
                statusCode(400).
                log().all().
                extract().response();
    }
}
