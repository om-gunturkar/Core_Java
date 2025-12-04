package InnerClass;

public class Test {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.show();

        Outer.Inner i = o.new Inner(); // Creating object of inner class
        i.display();
    }
}
