public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("KAREL");
        employee.sayHello("TRISNANTO");

        employee = new manager("RATNA");
        employee.sayHello("AMANDA");

        employee = new vicePresident("NADIA");
        employee.sayHello("CALISTA");

        System.out.println();

        sayHello(new Employee("BUDI"));
        sayHello(new manager("SARAH"));
        sayHello(new vicePresident("KAREL"));

    }

    static void sayHello(Employee employee){
        if (employee instanceof vicePresident VP){
            System.out.println("Hello Vice President " + VP.name);
        } else if (employee instanceof manager Manager) {
            System.out.println("Hello Manager " + Manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
