package Aggregation;

public class Test {

    public static void main(String[] args) {

        DOJ d1 = new DOJ(11, 2024, "Nov");

        Employee e = new Employee(111, "Meena", 2000.4f, d1);

        e.display();
    }
}
