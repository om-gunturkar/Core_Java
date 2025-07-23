package J_innerClass;

public class LocalInnerClassExample {
    private String message = "Hello from Outer Class!";

    public void displayMessage() {
        // Local Inner Class defined inside a method
        class LocalClass {
            public void printMessage() {
                System.out.println("Message from Local Inner Class: " + message);
            }
        }

        // Create an instance of the local inner class and call its method
        LocalClass local = new LocalClass();
        local.printMessage();
    }

    public static void main(String[] args) {
        LocalInnerClassExample outer = new LocalInnerClassExample();
        outer.displayMessage(); // Output: Message from Local Inner Class: Hello from Outer Class!
    }
}
