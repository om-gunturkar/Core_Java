package M_exceptionHandelling;

public class Sample5 {

    public static void main(String[] args) {

        try {
            int ans[] = {2, 4, 6};
            System.out.println(ans[2]);

            try {
                int ans1 = ans[2] / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
