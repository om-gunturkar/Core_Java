package P_multiThreading;
import java.util.Scanner;
public class Calculator extends Thread{
    static int number;

    int even_odd(int number){

        synchronized (this){
            if(number%2==0){
                System.out.println("number is even");
            }else{
                System.out.println("Number is odd");
            }

        }
        return number;
    };
    public void run(){
        System.out.println(even_odd(number));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        number=sc.nextInt();
        Calculator obj=new Calculator();
        obj.start();
    }
}
