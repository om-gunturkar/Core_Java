package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(13);
        list.add(90);
        list.add(11);
        list.add(123);
        list.add(11);

        System.out.println("List elements: " + list);

        System.out.println("----- Using Iterator -----");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----- Using For Each Loop ----");
        for (int x : list) {
            System.out.println(x);
        }

        // Creating another ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(123);
        list1.add(234);
        list1.add(123);
        list1.addAll(list); // Add all elements of list

        System.out.println("New List: " + list1);
        System.out.println("Index of 123 : " + list1.indexOf(123));
        System.out.println("Last Index of 123 : " + list1.lastIndexOf(123));

        list1.addFirst(1111);
        list1.addLast(345);
        System.out.println("After Add First & Last: " + list1);

        System.out.println("Contains 123? : " + list1.contains(123));
        System.out.println("Is Empty? : " + list1.isEmpty());

        System.out.println("Get Index 1: " + list1.get(1));
        System.out.println("Get First : " + list1.getFirst());
        System.out.println("Get Last : " + list1.getLast());

        list1.remove(0); // remove first index element
        list1.removeFirst();
        list1.removeLast();
        System.out.println("After Remove: " + list1);

        list1.clear();
        System.out.println("After Clear: " + list1);
    }
}

