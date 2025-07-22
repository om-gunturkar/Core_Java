package H_Oops.constructor;

import java.util.Scanner;

public class task1 {
    int [] numbers;
    public task1(int [] numbers){
        this.numbers=numbers;
    }
    public void printDisplay(){
        System.out.println("Printing Odd Numbers");
          for(int num:numbers){
              if(num%2!=0){
                  System.out.println(num);
              }
          }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] num=new int [5];
        System.out.println("Enter 5 numbers : ");
        for (int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        task1 obj=new task1(num);
        obj.printDisplay();
    }
}
