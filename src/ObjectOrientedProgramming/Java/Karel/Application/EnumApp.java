package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.Customer;
import ObjectOrientedProgramming.Java.Karel.Data.Level;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setName("Karel Trisnanto Utomo");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription()); // me-return value dari constructor enum level

        // Convert Enum ke String dan sebaliknya
        System.out.println();
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println(Arrays.toString(levels));

    }
}
