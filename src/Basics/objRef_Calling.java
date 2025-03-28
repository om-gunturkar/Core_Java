package Basics;

public class objRef_Calling {
    int age = 18;
    public static void main(String[] args) {
        objRef_Calling obj = new objRef_Calling();
        // class_name object_name = new class_name(); -> OBJECT REFERENCE
        System.out.println(obj.age);
    }
}
