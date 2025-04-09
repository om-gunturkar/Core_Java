package Questions;

import java.util.Scanner;

public class largestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        //Q. Find largest in 3 numbers

//  NORMAL METHOD

//        int max = a;
//        if(b>max){
//            max=b;
//        }if(c>max){
//            max=c;
//        }
//
//        System.out.println("The max is "+max);

//  MATH method

        int max= Math.max(a,b);
        System.out.println("MAX is : "+max);
    }
}
