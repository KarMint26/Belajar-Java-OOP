package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.Avanza;
import ObjectOrientedProgramming.Java.Karel.Data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

    }
}
