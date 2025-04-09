package Questions;
import java.util.Scanner;

// The next number is sum of prev 2 numbers
public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter Number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n){
            int temp=b;
            b+=a;
            a=temp;
            count++;
        }
        System.out.println(b);


    }
}
