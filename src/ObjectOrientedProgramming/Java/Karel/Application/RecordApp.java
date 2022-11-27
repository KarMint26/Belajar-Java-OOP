package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Karel Trisnanto Utomo", "26Nov2003");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest); // lebih enak karena secara default sudah di set untuk toString dan hashCode.

        System.out.println();
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Karel Trisnanto Utomo"));
        System.out.println(new LoginRequest("Karel", "GreatChoice"));

    }
}
