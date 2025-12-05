package P_multiThreading.GarbageCollection;

public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1 = e2;

        Employee e3 = new Employee();
        e3 = null;

        System.gc(); // Request GC
    }
}

