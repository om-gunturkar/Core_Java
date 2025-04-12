package Questions;

import java.util.Scanner;

// print 3 digit armstrong numbers - sum of each digit and their cube and their sum it the 3 digit numbers.
public class armstrongNumbers {
    public static boolean isArmstrong(int n){
    int original=n;
    int sum=0;

    while(n>0){
        int rem=n%10;
        n/=10;
        sum=sum+rem*rem*rem;

    }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
