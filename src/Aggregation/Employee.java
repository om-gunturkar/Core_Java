package Aggregation;

public class Employee {

    int id;
    String name;
    float salary;

    DOJ doj;  // Aggregation (HAS-A Relationship)

    public Employee(int id, String name, float salary, DOJ doj) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.doj = doj;
    }

    void display() {
        System.out.println("ID: " + id + "  Name: " + name + "  Salary: " + salary);
        System.out.println("Date of Joining: " + doj.date + " " + doj.month + " " + doj.year);
    }
}

