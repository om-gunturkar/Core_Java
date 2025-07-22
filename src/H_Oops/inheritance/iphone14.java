package H_Oops.inheritance;

public class iphone14 extends iphone13{
    public static void camera(){
        System.out.println("This can click 1080 photoes");
        System.out.println("This can 4k videos");
    }

    public static void main(String[] args) {
        iphone14 obj=new iphone14();
        obj.Calling();
        obj.price=20000;
        obj.model="Iphone 14 NEW";
        obj.battery=6000;
        System.out.println("The price is "+obj.price);
        System.out.println("The model is "+obj.model);
        System.out.println("The battery is "+obj.battery);

    }
}
