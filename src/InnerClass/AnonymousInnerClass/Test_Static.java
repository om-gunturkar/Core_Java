package InnerClass.AnonymousInnerClass;

public class Test_Static {

    public static void main(String[] args) {

        Outer_Static.Inner obj = new Outer_Static.Inner();  // No need to create Outer object
        obj.show2();

        Outer_Static.Inner.display2();  // Calling static method
    }
}