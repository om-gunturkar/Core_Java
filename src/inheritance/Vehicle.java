package inheritance;

public class Vehicle {
    String brand;
    int yearofmanu;
    String modelType;

    public Vehicle(String brand, int yearofmanu,String modelType){
        this.brand=brand;
        this.yearofmanu=yearofmanu;
        this.modelType=modelType;
    }
    public void display(){
        System.out.println("Brand of vehicle is :"+brand);
        System.out.println("year of manufacture of vehicle is :"+yearofmanu);
        System.out.println("model type of vehicle is :"+modelType);
    }
}
