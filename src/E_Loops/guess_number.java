package E_Loops;

import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int setNum=60;
        while(true){
            System.out.println("Guess the number : ");
            int guessNum=sc.nextInt();
            if(guessNum==setNum){
                System.out.println("Correct, Match is found");
                break;
            }else if(guessNum>setNum){
                System.out.println("The number is TOO HIGH");
                break;
            }
            else{
                System.out.println("The number is TOO LOW");
                break;
            }
        }
    }
}
