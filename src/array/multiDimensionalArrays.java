package array;
import java.util.*;
public class multiDimensionalArrays {

    public static void main(String[] args) {

        //2D arrays
        Scanner sc=new Scanner(System.in);
//        int[][] arr=new int[3][];  // here the 3 numbers is mandatory box (left side)

        //or

//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9,10}
//
//        };
        int[][] arr=new int[3][2];
        System.out.println(arr.length);
        for(int row=0;row<arr.length;row++){
            //for each column in every row
            for (int col=0;col<arr[row].length;col++){ //arr[row] -> every array at that row , the length of that array

            arr[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            //for each column in every row
            for (int col=0;col<arr[row].length;col++){ //arr[row] -> every array at that row , the length of that array

                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }


}
