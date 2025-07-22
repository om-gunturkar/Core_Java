package G_Array.Pattern_Printing;

import java.util.Scanner;

public class ulta_equi_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row and column : ");
        int num=sc.nextInt();

        for(int i=num;i>=1;i--){
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
