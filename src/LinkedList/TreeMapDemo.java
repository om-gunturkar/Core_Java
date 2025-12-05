package LinkedList;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "meena");
        map.put(11, "heena");
        map.put(21, "teena");
        map.put(41, "meena");
        map.put(12, "leela");
        map.put(2, "leela");
        map.put(90, null);

        System.out.println("Sorted Map: " + map.entrySet());
        System.out.println("HeadMap (<21): " + map.headMap(21, false));
        System.out.println("TailMap (>=21): " + map.tailMap(21));
        System.out.println("Higher Key >21: " + map.higherKey(21));
        System.out.println("Descending Key Set: " + map.descendingKeySet());
        System.out.println("Descending Map: " + map.descendingMap());
        System.out.println("Reverse order: " + map.reversed());
    }
}

