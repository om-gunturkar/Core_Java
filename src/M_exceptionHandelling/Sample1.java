package M_exceptionHandelling;
//Arithmatic Expression
public class Sample1 {

    public static void main(String[] args) {

        try {
            int num = 34;
            int ans = num / 0;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Rest of code...");
    }
}