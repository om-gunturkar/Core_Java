package InnerClass;

public class Outer {

    private int num = 22;

    void show() {
        System.out.println("Outer class method!!!");
    }

    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Inner class method!!! Num = " + num);
        }
    }
}
