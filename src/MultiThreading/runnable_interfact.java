package MultiThreading;

public class runnable_interfact implements Runnable{

    public void run(){
        System.out.println("Thread 2 starts");
    }

    public static void main(String[] args) {
        runnable_interfact obj=new runnable_interfact();
        Thread obj1=new Thread(obj);
        obj1.start();
    }
}
