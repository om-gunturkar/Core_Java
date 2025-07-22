package D_Functions;

/*
[access_modifier] [static] [return_type] methodName([parameters]) {
    // method body
    return value; // if return_type is not void
}
In Java, functions are called methods. They are blocks of code that perform a specific task. Methods enhance code reusability and organization.
Access Modifiers: public, private, protected, default

static keyword: If present, the method belongs to the class, not an object.

return_type: The data type of the value returned by the method. void if nothing is returned.

parameters: Input values the method accepts.
*/

public class MethodExample {

    // Method with no parameters and no return value (void)
    public void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method with parameters and a return value
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Static method
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MethodExample obj = new MethodExample();

        // Calling a non-static method
        obj.greet();

        // Calling a method with parameters and using its return value
        int result = obj.add(5, 3);
        System.out.println("Sum: " + result);

        // Calling a static method directly using the class name
        double area = MethodExample.calculateCircleArea(7.0);
        System.out.println("Area of circle: " + area);
    }
}
