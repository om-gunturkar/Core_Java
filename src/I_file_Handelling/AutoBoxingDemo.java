package I_file_Handelling;

public class AutoBoxingDemo {

    public static void main(String[] args) {

        int x = 2;
        System.out.println(x);

        Integer y = Integer.valueOf(x); // Manual Boxing
        System.out.println(y);

        Integer z = x; // AutoBoxing
        System.out.println(z);
    }
}
