package M_exceptionHandelling;

public class Sample3 {

    public static void main(String[] args) {

        try {
            int arr[] = {3, 5, 7};
            System.out.println(arr[2]);
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
