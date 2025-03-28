/*
take input from user to enter radius, side , find area of circle , area of square

 */
package Basics;


import java.util.Scanner;
public class Q_1 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius : ");
        double radius=sc.nextDouble();
        System.out.println("The area of circle is : " + (3.14*radius*radius));

        System.out.println("Enter the side : ");
        double side=sc.nextDouble();
        System.out.println("The area of circle is : " + (side*side));

    }




}
