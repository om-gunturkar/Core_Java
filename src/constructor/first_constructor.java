package constructor;

public class first_constructor {
    public first_constructor(){ // non parametrized constructor
        System.out.println("This is constructor 1");
    }
    public first_constructor(int a){ // parametrized constructor
        System.out.println("This is constructor 2");
    }

    public static void main(String[] args) {
        first_constructor obj=new first_constructor();
        first_constructor obj1=new first_constructor(10);

    }
}
