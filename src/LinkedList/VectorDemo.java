package LinkedList;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();
        v1.add(11);
        v1.add(22);
        v1.add(13);
        v1.add(1);

        System.out.println("Vector: " + v1);

        System.out.println("Element at index 0: " + v1.elementAt(0));

        v1.addElement(66);
        System.out.println("After addElement(): " + v1);

        System.out.println("First Element: " + v1.firstElement());
    }
}

