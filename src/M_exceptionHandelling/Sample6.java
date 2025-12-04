package M_exceptionHandelling;

public class Sample6 {

    public static void main(String[] args) {

        try {
            int ans = 3 / 0;
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Important line of code (finally block executes always)");
        }
    }
}
