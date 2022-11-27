package ObjectOrientedProgramming.Java.Karel.Data;

public class Application {

    public static int PROCESSORS;

    static {
        System.out.println("Access to application class");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
