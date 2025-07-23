package J_innerClass;

import java.util.Scanner;

public class AreaCalculator { // Main/Outer Class: Area

    // Member Inner Class for Area of Circle
    class AreaOfCircle { // Inner class: Areaofcircle
        public void calculateArea(double radius) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle with radius " + radius + " is: " + area);
        }
    }

    // Member Inner Class for Area of Rectangle
    class AreaOfRectangle { // Inner class: Areaofrectangle
        public void calculateArea(double length, double width) {
            double area = length * width;
            System.out.println("Area of Rectangle with length " + length + " and width " + width + " is: " + area);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator(); // Create an object of the outer class

        // Calculate Area of Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        // Create an object of the inner class AreaOfCircle using the outer class instance
        AreaCalculator.AreaOfCircle circleCalc = calculator.new AreaOfCircle();
        circleCalc.calculateArea(radius);

        System.out.println("-------------------------");

        // Calculate Area of Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        // Create an object of the inner class AreaOfRectangle using the outer class instance
        AreaCalculator.AreaOfRectangle rectangleCalc = calculator.new AreaOfRectangle();
        rectangleCalc.calculateArea(length, width);

        scanner.close();
    }
}
