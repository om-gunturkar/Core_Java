package H_Oops.METHOD_Overloading;

public class Calculate {

    void Add() {
        System.out.println("Addition: " + (2 + 3));
    }

    void Add(int x, int y) {
        System.out.println("Addition: " + (x + y));
    }

    void Add(int x, float y) {
        System.out.println("Addition: " + (x + y));
    }

    void Add(float x, int y) {
        System.out.println("Addition: " + (x + y));
    }
}

