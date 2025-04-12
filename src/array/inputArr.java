package array;

import java.util.Scanner;

public class inputArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=24;
        arr[1]=34;
        arr[2]=56;
        arr[3]=77;
        arr[4]=80;
        System.out.println(arr[3]);

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }



}
