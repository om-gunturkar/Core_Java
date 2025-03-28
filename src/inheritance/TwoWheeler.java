package inheritance;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(String brand,int yearofmanu,String modelType){
        super(brand,yearofmanu,modelType);
    }
    public void twowheeler(){
        System.out.println("This is small vehicle");
        System.out.println("This is bike");
        System.out.println("This vehicle const of two vehicle");
    }
}
