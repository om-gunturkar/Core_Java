package P_multiThreading.GarbageCollection;

public class Employee {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object collected by GC!");
    }
}

