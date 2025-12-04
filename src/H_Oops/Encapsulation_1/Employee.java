package H_Oops.Encapsulation_1;

public class Employee {

    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter for ID
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Salary
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println(id + "  " + name + "  " + salary);
    }

    // toString Override
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
