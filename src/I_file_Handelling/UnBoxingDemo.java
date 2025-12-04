package I_file_Handelling;

public class UnBoxingDemo {

    public static void main(String[] args) {

        Integer i = new Integer(2);
        System.out.println(i);

        int j = i.intValue(); // Manual Unboxing
        System.out.println(j);

        int k = i; // Auto Unboxing
        System.out.println(k);
    }
}
