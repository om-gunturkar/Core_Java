package Interface;

public interface BankApp {

    int b_id = 777;  // public static final implicitly

    void ROI();      // abstract method implicitly

    // Java 8 -> Static method inside interface
    static void show() {
        System.out.println("Static method implemented inside interface");
    }

    // Java 8 -> Default method inside interface
    default void disp() {
        System.out.println("Default method implemented inside interface");
    }

    // Java 9 -> Private method inside interface
    private void fun() {
        System.out.println("Private method implemented inside interface");
    }
}

