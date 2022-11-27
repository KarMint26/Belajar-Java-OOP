package ObjectOrientedProgramming.Java.Karel.Data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "GOLDEN";
    }

    public boolean IsMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
