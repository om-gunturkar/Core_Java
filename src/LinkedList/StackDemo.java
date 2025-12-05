package LinkedList;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(11);
        stack.add(222);
        stack.add(2345);
        System.out.println("Initial Stack: " + stack);

        stack.push(2);
        stack.push(234);
        System.out.println("After push(): " + stack);

        stack.pop();
        System.out.println("After pop(): " + stack);
    }
}

