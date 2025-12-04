package String;

public class SampleStringOps {

    public static void main(String[] args) {

        // join()
        String j1 = String.join("/", "welcome", "to", "my", "class");
        System.out.println(j1);

        // split()
        String s1 = "welcome to my class";
        String[] words = s1.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        // trim()
        String s2 = "  welcome to my class  ";
        System.out.println("Before Trim Length : " + s2.length());
        System.out.println(s2);
        System.out.println("After Trim Length : " + s2.trim().length());
        System.out.println(s2.trim());
    }
}
