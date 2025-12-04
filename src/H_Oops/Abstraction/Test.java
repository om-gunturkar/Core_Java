package H_Oops.Abstraction;

public class Test {

    public static void main(String[] args) {

        Bank b1;

        b1 = new AxisBank();
        b1.ROI();

        b1 = new Hdfc();
        b1.ROI();

        b1.show();     // Non-abstract method
        Bank.disp();   // Static method
        b1.func();     // Final method
    }
}
