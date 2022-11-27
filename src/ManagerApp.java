public class ManagerApp {
    public static void main(String[] args) {
        System.out.println();
        manager myManager = new manager("Yohanes Karel Trisnanto Utomo", "TOKOPEDIA");
        myManager.sayHello("Florentina Angelica");
        myManager.sayCompany("Angelica Vurnieca");

        System.out.println("\nObject Ke-2 Child Dari Parent (manager)");
        vicePresident myPresident = new vicePresident("Karel Trisnanto Utomo", "SHOPEE");
        myPresident.sayHello("Fritzzy Clarine");
        myPresident.sayWelcome("Natasha Violencia");
        myPresident.sayCompany("Xavier Atziera");

        System.out.println("\nIni adalah object child ke-2");
        vicePresident myPresident2 = new vicePresident("Johanes Christoper");
        myPresident2.sayHello("Thomas Matullesy");
        myPresident2.sayWelcome("Otto Iskandar Dinata");
    }
}
