package constructor;
import java.util.Scanner;
public class second_constructor {
    double area;
    public second_constructor(double radius){
        this.area=3.14*radius*radius;
    }
    public second_constructor(int side){
        this.area=side*side;
    }
    public second_constructor(int length,int width){
        this.area=length*width;
    }
    public void DisplayArea(String ShapeName){
        System.out.println("The Area of the "+ShapeName+" is : "+area);
    }

    public static void main(String[] args) {
        second_constructor obj=new second_constructor(5.0);
        obj.DisplayArea("Circle");
        second_constructor obj1=new second_constructor(4);
        obj.DisplayArea("Square");
        second_constructor obj2=new second_constructor(5,8);
        obj.DisplayArea("Rectangle");
    }
}
