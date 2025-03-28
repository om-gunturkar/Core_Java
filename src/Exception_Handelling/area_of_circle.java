package Exception_Handelling;
import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args) throws IllegalAccessException{
        Scanner sc=new Scanner(System.in);
        double radius=0;

        try{
            System.out.print("Enter the radius : ");
            radius=sc.nextDouble();
            if(radius<0){
                throw new IllegalAccessException("Radius can not be negative");
            }
            else {
                double area = 3.14*radius*radius;
                System.out.println("the area of circle is : "+area);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Next Line Code");

    }
}
