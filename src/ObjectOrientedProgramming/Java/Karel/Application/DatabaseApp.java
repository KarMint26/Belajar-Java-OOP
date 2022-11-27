package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Annotation.Fancy;
import ObjectOrientedProgramming.Java.Karel.error.DatabaseError;

import java.util.Scanner;

@Fancy(name = "Karel Trisnanto Utomo", tags = {"Yohanes", "Karel", "Trisnanto", "Utomo"})
public class DatabaseApp {
    public static String username,password;
    public static Scanner scanner = new Scanner(System.in);
    public static String inputScan(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }

    @Fancy(name = "Karel Trisnanto Utomo", tags = {"Yohanes", "Karel", "Trisnanto", "Utomo"})
    public static void main(String[] args) {

        username = inputScan("\nInput Username");
        password = inputScan("Input Password");

        try {
            connectDatabase(username, password);
            System.out.println("Data Valid............");
            System.out.println("\nUsername : " + username);
            System.out.println("Password : " + password);
        } catch (DatabaseError error){ // ERROR EXCEPTION is not recommend.
            System.out.println("ERROR : " + error.getMessage());
        }

    }

    public static void connectDatabase(String username, String password){
        if (username.isBlank() || password.isBlank()){
            throw new DatabaseError("Input Tidak Valid, Keluar Aplikasi........");
        }
    }
}
