package LinkedList;

public class Employee1 implements Comparable<Employee1> {

    int id;
    String name;
    float salary;

    public Employee1(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int compareTo(Employee1 o) {
        return this.id - o.id;   // ascending by ID
    }
}

