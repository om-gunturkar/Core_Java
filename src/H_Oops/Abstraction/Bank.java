package H_Oops.Abstraction;


public abstract class Bank {

    abstract void ROI();  // abstract method

    Bank() {
        System.out.println("Constructor of abstract class called!!!");
    }

    void show() {
        System.out.println("Non-abstract method inside abstract class!");
    }

    static void disp() {
        System.out.println("Static method inside abstract class.");
    }

    final void func() {
        System.out.println("Final method inside abstract class.");
    }
}
