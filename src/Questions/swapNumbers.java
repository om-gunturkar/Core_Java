package Questions;

import java.util.Arrays;

public class swapNumbers {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,8,99};
        swap(arr,1,3); // swap for indices

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
         arr[index1]=arr[index2];
         arr[index2]=temp;

    }
}
