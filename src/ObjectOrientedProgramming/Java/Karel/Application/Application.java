package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.*; // Mengakses semua class di package Data

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Xiaomi Mi 12 Pro", 15_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data("Johannes");
        System.out.println(data.name);

    }
}
