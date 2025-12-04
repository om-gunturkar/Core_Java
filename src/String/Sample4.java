package String;

public class Sample4 {

    public static void main(String[] args) {

        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = new String("Welcome");
        String s4 = "WELCOME";

        System.out.println(s1 == s2);     // true — both from constant pool
        System.out.println(s1 == s3);     // false — new object in heap

        s3 = s3.intern();                 // Move to constant pool
        System.out.println(s1 == s3);     // true — same pool ref

        System.out.println(s1 == s4);     // false — different string

        System.out.println(s1.equals(s4));        // false — case matters
        System.out.println(s1.equals(s2));        // true
        System.out.println(s1.equalsIgnoreCase(s4)); // true
    }
}
