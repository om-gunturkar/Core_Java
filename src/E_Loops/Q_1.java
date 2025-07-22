package E_Loops;
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Last Number : ");
        int num2=sc.nextInt();

        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
