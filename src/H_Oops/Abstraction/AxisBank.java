package H_Oops.Abstraction;

public class AxisBank extends Bank {

    public AxisBank() {
        super(); // calling abstract class constructor
    }

    @Override
    void ROI() {
        System.out.println("ROI of Axis Bank");
    }
}