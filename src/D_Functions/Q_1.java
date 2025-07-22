package D_Functions;

import java.util.Scanner;

public class Q_1 {

    public static void SortNumber(int a, int b, int c){

        if(a%2==0){
            System.out.println(a);
        }if(b%2==0){
            System.out.println(b);
        }if(c%2==0){
            System.out.println(c);
        }if(!(a%2==0 || b%2==0 || c%2==0)){
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        SortNumber(a,b,c);


    }
}
