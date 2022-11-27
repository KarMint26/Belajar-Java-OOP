package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Thank you for this section");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hi My Name's " + name + " and " + about);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Karel Trisnanto Utomo");

        System.out.println();

        HelloWorld helloWorld2 = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hei it's fun day, let's make happy together");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hallo my name is " + name + " " + about);
            }
        };

        helloWorld2.sayHello();
        helloWorld2.sayHello("Florentina Natasha");

        // Ini adalah anonymous Class yang didapat dari interface object, harus membuat block method.

    }
}
