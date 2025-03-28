package inheritance;

public class iphone13 {
    static int price; // there will be only one copy of class , many objects can be created using it
    static String model;
    static int battery;

    public static void Calling(){
        System.out.println("This mobile can call");
    }
    public static void Camera(){
        System.out.println("This mobile can click Photoes");
        System.out.println("This mobile can record videos");
    }

    public static void main(String[] args) {
        price=10000;
        model="iphone 14 NEW";
        battery=5000;
        System.out.println("The price is "+price);
        System.out.println("The model is "+model);
        System.out.println("The battery is "+battery);
        Calling();
        Camera();
    }

}
