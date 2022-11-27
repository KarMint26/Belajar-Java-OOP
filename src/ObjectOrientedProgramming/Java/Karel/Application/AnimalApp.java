package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.*; // Import semua class di package Data

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.name = "Blacky Heavy"; // animale.name adalah sebenarnya Child Dog
        animal.run(); // animal.run() sebenarnya adalah Child Dog diset run methodnya

    }
}
