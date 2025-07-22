package G_Array;

import java.util.Scanner;

public class array2D_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] flats=new int[3][3];
        System.out.println("Enter details");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter values ["+i+"]["+j+"]:");
                flats[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Printing the matrix : ");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
