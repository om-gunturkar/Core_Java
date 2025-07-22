// using THREAD CLASS
package P_multiThreading;

public class first extends Thread{

    public void run(){
        System.out.println("Thread 1 starts");
    }

    public static void main(String[] args) {
        first obj=new first();
        obj.start();
        first obj1=new first();
        obj1.start();
    }


}
