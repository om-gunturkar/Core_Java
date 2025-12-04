package H_Oops.RunTime_Polymorphism;

public class Test {

    public static void main(String[] args) {

        // Upcasting
        Person p;

        p = new Employee();
        p.running();

        p = new Shopkeeper();
        p.running();
    }
}
/*
Output -
Employee can run fast!!
Shopkeeper can run slow!!

 */
