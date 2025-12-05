package LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        // ---------- HashSet (No order, Allows Null, No duplicates) ----------
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(22);
        s1.add(1);
        s1.add(24);
        s1.add(2);
        s1.add(null);

        System.out.println("HashSet: " + s1);


        // ---------- LinkedHashSet (Maintains order of insertion) ----------
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        l1.add(23);
        l1.add(1);
        l1.add(234);
        l1.add(13);
        l1.add(null);

        System.out.println("LinkedHashSet: " + l1);


        // ---------- TreeSet (Sorted, No null allowed) ----------
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(12);
        t1.add(90);
        t1.add(11);
        t1.add(1);
        t1.add(9);

        System.out.println("TreeSet (Ascending): " + t1);
        System.out.println("TreeSet (Descending): " + t1.descendingSet());


        System.out.println("\nTreeSet iterator:");
        Iterator<Integer> it = t1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nTreeSet Descending Iterator:");
        Iterator<Integer> it2 = t1.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


        // ---------- NavigableSet (Extended TreeSet features) ----------
        NavigableSet<Integer> s11 = new TreeSet<>();
        s11.add(22);
        s11.add(1);
        s11.add(34);
        s11.add(2);
        s11.add(11);
        s11.add(9);

        System.out.println("\nNavigableSet: " + s11);
        System.out.println("Reversed : " + s11.reversed());
        System.out.println("Head Set (<22): " + s11.headSet(22));
        System.out.println("Tail Set (>=22): " + s11.tailSet(22));
        System.out.println("SubSet (2 to 22): " + s11.subSet(2, 22));
    }
}

