package H_Oops.Polymorphism;

public class basics {

    double Area(double radius){
        return 3.14*radius*radius;
    }
    private int Area(int side1,int side2){
        return side1*side2;

    }
    public void Area (int side){
        System.out.println("Area of square is : "+side*side);
    }

    public static void main(String[] args) {
        basics obj=new basics();
        System.out.println("Area of circle is "+obj.Area(10.09));
        System.out.println("Area of rect is "+obj.Area(10,20));
        obj.Area(10);
    }
}
