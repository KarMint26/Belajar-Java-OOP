package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.LoginRequest;
import ObjectOrientedProgramming.Java.Karel.error.ValidationException;
import ObjectOrientedProgramming.Java.Karel.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("",null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e){
            System.out.println("Data Tidak Valid : " + e.getMessage());
        } finally { // Selalu dieksekusi
            System.out.println("Selalu Di Eksekusi Ketika Error ataupun tidak");
        }

        System.out.println();

        LoginRequest loginRequest2 = new LoginRequest("Karel Trisnanto Utomo", "26112003");

        try {
            ValidationUtil.validate(loginRequest2);
            System.out.println("Data Valid");
        } catch (ValidationException exception){
            System.out.println("Data Tidak Valid : " + exception.getMessage());
        } catch (NullPointerException nullPointerException){
            System.out.println("Data Null : " + nullPointerException.getMessage());
        }

//        LoginRequest loginRequest3 = new LoginRequest(null,null);
//        ValidationUtil.validateRuntime(loginRequest3); // Error dan berhenti
//        System.out.println("Success");

        LoginRequest loginRequest3 = new LoginRequest("KAREL", "SAGITARIUS");
        ValidationUtil.validateRuntime(loginRequest3);
        System.out.println("Success");

    }
}
