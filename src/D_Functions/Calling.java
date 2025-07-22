package D_Functions;

public class Calling {
    //access_specifier return_type name_of_function();

    //non_static non_parametrized function

    public void printHello(){
        System.out.println("Hello Coders");
        System.out.println("Java Developers");
    }

    public static void main(String[] args) {
        Calling obj=new Calling();

        obj.printHello(); // OBJECT REFERENCE
    }
}
