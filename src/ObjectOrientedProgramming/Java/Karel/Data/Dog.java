package ObjectOrientedProgramming.Java.Karel.Data;

public class Dog extends Animal{

    public String name = "Cuttie";
    public void run(){
        System.out.println("Dog " + name + " is run"); // akan menghasilkan Cuttie karena tidak ada super keyword
        System.out.println("Handsome " + super.name + " is Very Handsome"); // SuperKeyword mengarah ke variable awal
    }

}
