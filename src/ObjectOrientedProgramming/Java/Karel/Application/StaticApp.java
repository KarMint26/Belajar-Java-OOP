package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.Application;
import ObjectOrientedProgramming.Java.Karel.Data.Constant;
import ObjectOrientedProgramming.Java.Karel.Data.Country;
import ObjectOrientedProgramming.Java.Karel.util.MathUtil;
// Ini adalah Import Static.
import static ObjectOrientedProgramming.Java.Karel.Data.Cleaner.*; // Mengimport data static di class Cleaner

public class StaticApp {
    public static void main(String[] args) {

        Constant constant = new Constant();

        System.out.println(constant.APPLICATION); // tanpa static harus membuat object terlebih dahulu.
        System.out.println(Constant.VERSION); // dengan keyword static tidak perlu membuat object dahulu.

        System.out.println(MathUtil.sum(2,1,5,3,6,2,1));

        Country.City city = new Country.City();
        city.setName("Karel Trisnanto Utomo");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
        System.out.println();

        System.out.println(VirusTrojan); // Import Static dari Class Cleaner.
    }
}
