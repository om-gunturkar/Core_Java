package M_exceptionHandelling.advance;

public class SampleThrowTryCatch {

    void check(int num) {
        if (num < 18) {
            throw new ArithmeticException("Number is not eligible!!!");
        } else {
            System.out.println("Number is eligible!!!");
        }
    }

    public static void main(String[] args) {

        SampleThrowTryCatch s1 = new SampleThrowTryCatch();
        try {
            s1.check(3);
        } catch (Exception e) {
            System.out.println("Handled: " + e);
        }

        System.out.println("Rest of code...");
    }
}
