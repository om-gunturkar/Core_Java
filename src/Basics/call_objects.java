package Basics;

public class call_objects {
    static int a = 18;

    public static void main(String[] args) {
        call_objects obj=new call_objects();

        System.out.println(obj.a); // OBJECT REFERENCE

        System.out.println(a); // DIRECT CALLING

        System.out.println(call_objects.a); // CLASS REFERENCE
    }
}
