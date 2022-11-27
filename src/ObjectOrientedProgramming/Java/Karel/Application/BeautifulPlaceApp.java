package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.beautifulPlace;

import java.util.Scanner;

public class BeautifulPlaceApp {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukkan Nama Anda : ");
        String myName = inputUser.nextLine();
        System.out.print("Masukkan Nama Tempat : ");
        String thePlaceIs = inputUser.nextLine();

        beautifulPlace myPlace = new beautifulPlace(myName);

        myPlace.sayIntro(thePlaceIs);

    }
}
