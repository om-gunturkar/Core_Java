package String;

public class Sample5 {

    public static void main(String[] args) {

        String s1 = "Butter";
        String s2 = "Paneer";
        String s3 = "Paneer";

        System.out.println(s1.compareTo(s2)); // Negative → s1 < s2
        System.out.println(s2.compareTo(s1)); // Positive → s2 > s1
        System.out.println(s2.compareTo(s3)); // Zero → equal

        String ss = "bbc";
        String ss1 = "Abc";
        System.out.println(ss.compareTo(ss1));

        char x = 'a';
        System.out.println((int) x); // ASCII → 97
    }
}
