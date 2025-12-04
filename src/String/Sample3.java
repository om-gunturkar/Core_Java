package String;

public class Sample3 {

    public static void main(String[] args) {

        String s1 = "welcome to my class to learn java end";

        System.out.println("Length: " + s1.length());
        System.out.println("First index of 'to': " + s1.indexOf("to"));
        System.out.println("Last index of 'to': " + s1.lastIndexOf("to"));
        System.out.println("Character at index 3: " + s1.charAt(3));

        String ss = "WELCOME";
        System.out.println("Lowercase: " + ss.toLowerCase());
        System.out.println("Uppercase: " + s1.toUpperCase());

        System.out.println("Contains 'class': " + s1.contains("class"));
        System.out.println("Ends with 'end': " + s1.endsWith("end"));
        System.out.println("Starts with 'star': " + s1.startsWith("star"));

        s1 = s1.replace("class", "Seven Mentore");
        System.out.println("Replace: " + s1);

        System.out.println("Is empty: " + s1.isEmpty());

        String s2 = "welcome to class learn java!";
        System.out.println("Substring (index 3): " + s2.substring(3));
        System.out.println("Substring (2,9): " + s2.substring(2, 9));
    }
}

