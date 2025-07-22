package A_dataTypes;
//Data types classify the type of values a variable can hold, determining the operations that can be performed on them. Java has two main categories:
//Primitive Data Types: Basic building blocks, directly store values.
//Integer Types: byte, short, int, long (for whole numbers).
//Floating-Point Types: float, double (for numbers with decimal points).
//Character Type: char (for single characters).
//Boolean Type: boolean (for true/false values).
//Non-Primitive (Reference) Data Types: Refer to objects. Examples include String, Arrays, Classes, Interfaces.
public class demo {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 100;         // -128 to 127
        short myShort = 30000;    // -32,768 to 32,767
        int myInt = 100000;       // ~ -2 billion to 2 billion
        long myLong = 15000000000L; // Suffix 'L' for long

        // Floating-point types
        float myFloat = 3.14f;    // Suffix 'f' for float
        double myDouble = 3.14159265359;

        // Character type
        char myChar = 'A';

        // Boolean type
        boolean isJavaFun = true;

        String greeting = "Hello, Java!"; // String is a class, not a primitive
        System.out.println(greeting);

        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + isJavaFun);
    }
}
