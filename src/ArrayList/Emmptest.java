package ArrayList;

import java.util.ArrayList;

public class Emmptest {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(1, "Meena", 200000));
        list.add(new Employee(2, "Teena", 220000));
        list.add(new Employee(4, "Reena", 240000));
        list.add(new Employee(3, "Heena", 260000));

        System.out.println(list); // print using toString

        for (Employee e : list) {
            System.out.println(e.id + "  " + e.name + "  " + e.salary);
        }
    }
}

