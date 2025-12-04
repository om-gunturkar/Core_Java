package String;

public class Sample2 {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("welcome"); // Mutable
        System.out.println("Before append: " + s1);
        s1.append(" to class");
        System.out.println("After append: " + s1);

        StringBuilder s2 = new StringBuilder("welcome"); // Mutable
        System.out.println("Before append: " + s2);
        s2.append(" to class");
        System.out.println("After append: " + s2);
    }
}