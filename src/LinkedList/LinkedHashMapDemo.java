package LinkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "meena");
        map.put(11, "heena");
        map.put(21, "teena");
        map.put(41, "meena");
        map.put(12, "leela");
        map.put(2, "leela");
        map.put(null, null);
        map.put(90, null);

        System.out.println("LinkedHashMap EntrySet():");
        System.out.println(map.entrySet());
    }
}
