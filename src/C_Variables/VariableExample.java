package C_Variables;
/*
Variables are named memory locations used to store data. They have a data type and a name. Before using a variable, it must be declared and can optionally be initialized.

Declaration: dataType variableName;

Initialization: variableName = value; or dataType variableName = value;

Types of Variables:
Local Variables: Declared inside a method, constructor, or block. Scope is limited to that block.

Instance Variables (Non-static fields): Declared inside a class but outside any method, constructor, or block. They belong to an object.

Static Variables (Class variables): Declared with the static keyword inside a class but outside any method. They belong to the class, not an object.
*/
public class VariableExample {
    // Instance variable
    String instanceMessage = "I am an instance variable.";

    // Static variable
    static String staticMessage = "I am a static variable.";

    public void displayMessages() {
        // Local variable
        String localMessage = "I am a local variable.";
        System.out.println(localMessage);
        System.out.println(instanceMessage); // Can directly access instance variable
    }

    public static void main(String[] args) {
        System.out.println(staticMessage); // Can directly access static variable

        VariableExample obj = new VariableExample();
        obj.displayMessages();
        // System.out.println(obj.localMessage); // ERROR: localMessage cannot be accessed here
    }
}
