class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // ini adalah constructor
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String paramName){
        name = paramName;
    }

    Person(){
        this.sayHello("Karel");
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
