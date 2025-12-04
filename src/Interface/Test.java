package Interface;

public class Test {

    public static void main(String[] args) {

        BankApp b1;

        b1 = new Axis();
        b1.ROI();

        b1 = new HDFC();
        b1.ROI();

        b1.disp();   // Calling default method
        BankApp.show();  // Calling static method of interface
    }
}
/*
Output -
ROI of Axis Bank!!!
ROI of HDFC Bank!!!
Default method implemented inside interface
Static method implemented inside interface
 */
