public class personApp {
    public static void main(String[] args) {

        Person personIndex = new Person("Karel Trisnanto Utomo", "Brebes");

        System.out.println(personIndex.name);
        System.out.println(personIndex.address);
        System.out.println(personIndex.country);

        System.out.println("\nIni Adalah Method di dalam Object");
        personIndex.sayHello("Natasha");

        System.out.println("\nObject ke-2");
        Person person2 = new Person("Natasha Arimesta", "Jawa Tengah");

        System.out.println(person2.name);
        System.out.println(person2.address);

        Person person3 = new Person();
        person3.name = "Yohanes Karel Trisnanto";
        person3.sayHello("Florentina");
    }
}
