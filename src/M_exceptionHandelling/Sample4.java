package M_exceptionHandelling;

public class Sample4 {

    public static void main(String[] args) {

        try {
            int arr[] = {3, 5, 7};
            System.out.println(arr[2]);
            System.out.println(arr[10]);

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
