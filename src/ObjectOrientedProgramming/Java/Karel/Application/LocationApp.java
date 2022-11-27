package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.City;
import ObjectOrientedProgramming.Java.Karel.Data.Location;

public class LocationApp {
    public static void main(String[] args) {

        // var location = new Location(); // Error
        City city = new City(); // Location location = new City();
        city.name = "Palangkaraya"; // location.name = "Palangkaraya";

        System.out.println(city.name); // System.out.println(location.name);

    }
}
