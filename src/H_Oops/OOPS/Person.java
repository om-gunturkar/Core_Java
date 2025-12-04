package H_Oops.OOPS;

public class Person {

    String name = "Meena";

    void dance() {
        System.out.println("Person can dance!!!");
    }

    public Person() {
        System.out.println("Person class constructor called!!!");
    }

    public Person(String name) {
        System.out.println("Person class parameterized constructor called!!!");
        this.name = name;
    }

}