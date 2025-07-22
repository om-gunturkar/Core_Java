package H_Oops.constructor;

public class first_constructor {
    public first_constructor(){ // non parametrized H_Oops.constructor
        System.out.println("This is H_Oops.constructor 1");
    }
    public first_constructor(int a){ // parametrized H_Oops.constructor
        System.out.println("This is H_Oops.constructor 2");
    }

    public static void main(String[] args) {
        first_constructor obj=new first_constructor();
        first_constructor obj1=new first_constructor(10);

    }
}
