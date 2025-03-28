package Basics;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Age : ");
        int age=sc.nextInt();

        System.out.println("Enter salary in decimal : ");
        float salary=sc.nextFloat();

        System.out.println("Enter the name : ");
        String name=sc.next();

        System.out.println("The age is : "+age);
        System.out.println("The salary is : "+salary);
        System.out.println("The name is : "+name);
    }
}
