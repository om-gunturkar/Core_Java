package InnerClass.AnonymousInnerClass;

public class Test_Interface {

    public static void main(String[] args) {

        Outer_Interface obj = new Outer_Interface() {
            @Override
            public void show1() {
                System.out.println("Anonymous Inner Class (Interface Implementation)");
            }
        };

        obj.show1();
    }
}
