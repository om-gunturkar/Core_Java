package InnerClass.concepts;

public class Outer {

    void show() {

        class Inner {
            void display() {
                System.out.println("Local Inner Class Method!!!");
            }
        }

        Inner i = new Inner();
        i.display();
    }
}
