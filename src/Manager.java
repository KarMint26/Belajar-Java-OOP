class manager extends Employee{

    String company;

    manager(String name){
        super(name); // yang tadinya Karel(di Employee Parentnya) jadi parameter di constructor manager)
    }

    manager(String name, String company){
        super(name); // yang tadinya Karel(di Employee Parentnya) jadi parameter di constructor manager)
        this.company = company;
    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
    void sayCompany(String name){
        System.out.println("Hi " + name + " My Company is " + this.company);
    }
}

class vicePresident extends manager { // Kelas Child atau Turunannya

    vicePresident(String name){
        super(name); // yang tadinya Karel(di Manager Parentnya) jadi parameter di constructor VP)
    }

    vicePresident(String name, String company){
        super(name, company);
    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is Vice President " + this.name); //method overriding
    }
    void sayWelcome(String name){
        System.out.println("Welcome to Indonesia Mrs." + name + ", and My Name is " + this.name);
    }
    void sayCompany(String name){
        System.out.println("Hi " + name + " My Company is " + this.company);
    }
}
