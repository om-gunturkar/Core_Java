package H_Oops.OOPS;

public class Employee extends Person {

    String name = "Pooja";
    int id;

    Employee() {
        super(); // Calls parent default constructor
        System.out.println("Employee default constructor called!!");
    }

    Employee(int id, String name) {
        super(name); // Calls parent parameterized constructor
        this.id = id;
        System.out.println("Employee parameterized constructor called!!");
    }

    void showEmp() {
        System.out.println("Employee Name: " + name + ", Id: " + id);
        System.out.println("Person Name: " + super.name);
    }

    @Override
    void dance() {
        System.out.println("Employee can dance!!!");
    }

    void show() {
        dance();       // Child method
        super.dance(); // Parent method
    }
}

