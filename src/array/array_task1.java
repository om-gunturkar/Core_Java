package array;

import java.util.Scanner;

public class array_task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();

        double[] values = new double[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the values : "+(i+1));
            values[i]=sc.nextDouble();
        }
        System.out.println("Printing the array : ");
        for(int i=0;i<size;i++){
            System.out.println(values[i]);
        }
    }
}



