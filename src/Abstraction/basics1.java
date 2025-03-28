package Abstraction;

public class basics1 implements demo1{
    public void display(){
        System.out.println("Display function called");
    }

    public static void main(String[] args) {
        basics1 obj=new basics1();
        obj.display();
        System.out.println(obj.value);
        System.out.println(value);
        System.out.println(basics1.value);
        System.out.println(demo1.value);
    }
}
