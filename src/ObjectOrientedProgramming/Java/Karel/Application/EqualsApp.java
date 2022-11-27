package ObjectOrientedProgramming.Java.Karel.Application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Karel";
        first = first + " " + "Trisnanto";

        System.out.println(first);

        String second = "Yohanes Karel";
        System.out.println(second);

        System.out.println(first.equals(second));

        String third = "Yohanes Karel";

        System.out.println(second.equals(third));

    }
}
