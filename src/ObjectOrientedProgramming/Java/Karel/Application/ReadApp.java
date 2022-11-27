package ObjectOrientedProgramming.Java.Karel.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadApp {
    public static void main(String[] args) {

        System.out.println("\nTry Without Resource");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(
                    new FileReader("README.MD")
            );

            while (true){
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                System.out.println(line);
            }
        } catch (Throwable throwable){
            System.out.println("Error Membaca File " + throwable.getMessage());
        } finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                    System.out.println("\nSukses Menutup");
                } catch (IOException exception){
                    System.out.println("Error menutup resource " + exception.getMessage());
                }
            }
        }

        System.out.println("\nTry With Resource");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama File : ");
        String fileName = scanner.nextLine();

        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileName))){
            while (true){
                String text = bufferedReader2.readLine();
                if (text == null) {
                    break;
                }
                System.out.println(text);
            }
            System.out.println("\nSUCCESS READING FILE");
        } catch (IOException exception){
            System.out.println("ERROR READING FILE : " + exception.getMessage());
        }

    }
}
