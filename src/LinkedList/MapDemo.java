package LinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1, "meena");
        m1.put(11, "heena");
        m1.put(21, "teena");
        m1.put(41, "meena");
        m1.put(12, "leela");
        m1.put(2, "leela");
        m1.put(null, null);
        m1.put(90, null);

        System.out.println("Map: " + m1);

        System.out.println("\nUsing entrySet():");
        Set<Map.Entry<Integer, String>> set = m1.entrySet();

        Iterator<Entry<Integer, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}

