package ObjectOrientedProgramming.Java.Karel.Data;

public class Avanza implements Car{

    public void drive() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Suzuki";
    }

    public boolean IsMaintenance() {
        return true;
    }
}
