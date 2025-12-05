package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "meena");
        map.put(11, "heena");
        map.put(21, "teena");
        map.put(41, "meena");
        map.put(12, "leela");
        map.put(2, "leela");
        map.put(null, null);
        map.put(90, null);

        System.out.println("EntrySet: " + map.entrySet());
        System.out.println("KeySet: " + map.keySet());
        System.out.println("Values: " + map.values());

        map.put(21, "meera");
        System.out.println("After update: " + map.entrySet());

        map.putIfAbsent(210, "nisha");
        System.out.println("After putIfAbsent: " + map.entrySet());

        map.remove(21);
        System.out.println("After remove: " + map.entrySet());

        System.out.println("Contains Key 21: " + map.containsKey(21));
        System.out.println("Contains Value 'nisha': " + map.containsValue("nisha"));

        System.out.println("Get value of key 41: " + map.get(41));

        System.out.println("Is map empty?: " + map.isEmpty());

        map.replace(210, "nidhi");
        System.out.println("After replace: " + map.entrySet());
    }
}

