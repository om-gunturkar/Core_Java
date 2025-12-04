package InnerClass.AnonymousInnerClass;

public class Test {

    public static void main(String[] args) {

        Outer obj = new Outer() {
            @Override
            void show() {
                System.out.println("Anonymous Inner Class (Abstract Implementation)");
            }
        };

        obj.show();
    }
}
