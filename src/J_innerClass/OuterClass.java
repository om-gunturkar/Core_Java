package J_innerClass;

public class OuterClass { // This is the Outer/Main class
    private int outerData = 10; // Private member of the outer class

    // Member Inner Class
    class MemberInnerClass {
        public void display() {
            // Inner class can access outer class's private members
            System.out.println("Data from OuterClass: " + outerData);
        }
    }

    public static void main(String[] args) {
        // To create an object of the inner class, you first need an object of the outer class
        OuterClass outer = new OuterClass();
        OuterClass.MemberInnerClass inner = outer.new MemberInnerClass();

        // Call the method of the inner class
        inner.display(); // Output: Data from OuterClass: 10
    }
}
