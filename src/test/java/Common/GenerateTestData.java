package Common;

import com.github.javafaker.Faker;

public class GenerateTestData {

    static Faker faker = new Faker();

    public static String cityName = faker.address().cityName();
    public static  String latitude = faker.address().latitude();
    public  static  String longitude = faker.address().longitude();
    public static   String altitude = faker.address().longitude();
}


