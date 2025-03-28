package Pattern_Printing;
import java.util.Scanner;
public class demo{
   public static void inv_triangle(int n){

       for (int i=1;i<=n;i++){
           //spaces
           for (int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=(2*i)-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i=n;i>=1;i--){
           //spaces
           for (int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=(2*i)-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n=sc.nextInt();
        inv_triangle(n);
    }
}