package P_multiThreading;

public class methods1 {
    public static void main(String[] args) throws InterruptedException{
        methods obj=new methods();
        obj.start();
        synchronized (obj){
            obj.wait();
        }
        System.out.println("total is "+obj.total);
    }
}
