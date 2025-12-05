package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeDemo {

    public static void main(String[] args) {

        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(11, new Employee(1, "meena", 20000));
        map.put(1, new Employee(2, "teena", 20000));
        map.put(21, new Employee(3, "reena", 20000));
        map.put(13, new Employee(4, "peena", 20000));

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            int key = entry.getKey();
            Employee emp = entry.getValue();
            System.out.println(key + " : " + emp.name + "  " + emp.salary);
        }
    }
}

