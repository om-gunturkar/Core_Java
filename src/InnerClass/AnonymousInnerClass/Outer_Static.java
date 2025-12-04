package InnerClass.AnonymousInnerClass;

public class Outer_Static {

    static int num = 22;

    // Static Inner Class
    static class Inner {

        void show2() {
            System.out.println("Static Inner Class Method: " + num);
        }

        static void display2() {
            System.out.println("Static Method inside Static Inner Class");
        }
    }
}
