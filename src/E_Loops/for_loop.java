package E_Loops;
import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("Enter the total numbers : ");
        int a = sc.nextInt();
        for (int j=1;j<=a;j++){
            System.out.println(j);
        }
        System.out.println(" ");
        for (int k=5;k>=0;k--){
            System.out.println(k);
        }
    }
}
