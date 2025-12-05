package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(11);
        list.add(22);
        list.add(44);

        System.out.println("Initial List: " + list);

        System.out.println("\nUsing Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing For Each Loop:");
        for (int j : list) {
            System.out.println(j);
        }

        // Merge ArrayList into LinkedList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(234);
        list1.add(123);

        list.addAll(list1);
        System.out.println("\nAfter addAll(): " + list);

        // Offer (Queue behavior)
        list.offer(102);
        list.offerFirst(11111);
        list.offerLast(9999);
        System.out.println("\nAfter offer operations: " + list);

        // Peek
        System.out.println("\nPeek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());

        // Poll (remove & return)
        System.out.println("\nPoll: " + list.poll());
        System.out.println("After poll(): " + list);

        System.out.println("Poll First: " + list.pollFirst());
        System.out.println("Poll Last: " + list.pollLast());
        System.out.println("After poll operations: " + list);
    }
}
