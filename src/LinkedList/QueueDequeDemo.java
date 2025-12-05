package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDequeDemo {

    public static void main(String[] args) {

        // PriorityQueue (Min-Heap)
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(111);
        q1.add(234);
        q1.add(4567);
        System.out.println("PriorityQueue: " + q1);

        // ArrayDeque
        Deque<Integer> q2 = new ArrayDeque<>();
        q2.add(34);
        q2.add(34);
        q2.add(56);

        q2.addFirst(111);
        q2.addLast(345);

        System.out.println("\nArrayDeque: " + q2);
        System.out.println("Peek First: " + q2.peekFirst());
        System.out.println("Peek Last: " + q2.peekLast());
    }
}
