package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeList {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(12, "pooja", 2000.0f));
        list.add(new Employee1(21, "pooja", 2000.0f));
        list.add(new Employee1(1, "pooja", 2000.0f));
        list.add(new Employee1(7, "pooja", 2000.0f));

        System.out.println("Before Sorting: " + list);
        Collections.sort(list);
        System.out.println("After Sorting by ID: " + list);
    }
}

