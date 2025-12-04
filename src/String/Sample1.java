package String;

public class Sample1 {

    public static void main(String[] args) {

        char[] s1 = {'s', 'e', 'v', 'e', 'n'};
        String s2 = new String("seven");  // Stored in heap memory (Non-Pool)
        String s3 = "seven";              // Constant Pool Memory
        String s4 = " seven";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s3 == s4);     // false — different objects
        System.out.println(s2 == s3);     // false — heap vs pool

        s3.concat(s4);
        System.out.println("After concat (without assignment): " + s3);

        s3 = s3.concat(s4); // Now appended string stored in a new object
        System.out.println("After concat (with assignment): " + s3);
    }
}
