package G_Array;

import java.util.Arrays;
import java.util.Scanner;

public class forEachLoop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=24;
        arr[1]=34;
        arr[2]=56;
        arr[3]=77;
        arr[4]=80;


        for(int num:arr){ // for EVERY ELEMENT in ARRAY, PRINT the ARRAY
            System.out.println(num + " "); //num -> element of the array
        }

        System.out.println(Arrays.toString(arr));
    }



}
