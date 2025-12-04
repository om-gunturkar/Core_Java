package M_exceptionHandelling.advance;

public class SampleThrow {

    void check(int num) {
        if (num < 18) {
            throw new ArithmeticException("Number is not eligible!!!");
        } else {
            System.out.println("Number is eligible!!!");
        }
    }

    public static void main(String[] args) {

        SampleThrow s1 = new SampleThrow();
        s1.check(34);

        System.out.println("Rest of code...");
    }
}
