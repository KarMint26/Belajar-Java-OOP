package ObjectOrientedProgramming.Java.Karel.Data;

class SocialMedia {
    String name;
}

final class facebook extends SocialMedia{

}

//class FakeFacebook extends facebook{ error karena class facebook sudah final
//
//}

class GameOnline {
    String gameName;
}

class mobileLegend extends GameOnline {
    final void login(String username, String password){
        System.out.println("Hi Sister" + username + " i'am " + this.gameName + " and my password " + password);
    }
}

class Pes2022 extends mobileLegend {
//    void login(String username, String password){
//        System.out.println("Hi Brother" + username + " i'am " + this.gameName + " and my password " + password);
//    } hasilnya akan error karena method di parentnya adalah method final yang tidak bisa di override.
}

abstract class GreatPlace {
    public String name;

    abstract void sayIntro(String nameOfPlace);
}

public class beautifulPlace extends GreatPlace {
    public beautifulPlace(String name){
        this.name = name;
    }

    public void sayIntro(String nameOfPlace){
        System.out.println("This name's place is " + nameOfPlace + " and my name is " + this.name);
    }
}