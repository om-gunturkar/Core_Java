package I_file_Handelling.BufferedReaderInput;

import java.io.Serializable;

public class Employee1 implements Serializable {

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
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}