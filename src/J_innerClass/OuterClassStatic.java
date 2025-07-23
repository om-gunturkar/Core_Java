package J_innerClass;

public class OuterClassStatic {
    private static String outerStaticData = "Static data from OuterClass";
    private String outerNonStaticData = "Non-static data from OuterClass";

    // Static Nested Class
    static class StaticNestedClass {
        public void displayStaticData() {
            // Can access static members of the outer class
            System.out.println("Accessing outer static data: " + outerStaticData);
        }

        // The following method would cause a compile-time error
        // as static nested classes cannot access non-static members directly.
        // public void displayNonStaticData() {
        //     System.out.println("Accessing outer non-static data: " + outerNonStaticData);
        // }
    }

    public static void main(String[] args) {
        // To create an object of a static nested class, you don't need an object of the outer class
        OuterClassStatic.StaticNestedClass nested = new OuterClassStatic.StaticNestedClass();
        nested.displayStaticData(); // Output: Accessing outer static data: Static data from OuterClass
    }
}
