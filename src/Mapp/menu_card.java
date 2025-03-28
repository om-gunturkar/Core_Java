package Mapp;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class menu_card {
    String dishName;
    double price;
    double rating;

    public menu_card(String dishName,double price,double rating){
        this.dishName=dishName;
        this.price=price;
        this.rating=rating;
    };
    public String toString(){
        return "Price : Rs"+price+", Rating : "+rating+" /5";
    }

    public static void main(String[] args) {
        TreeMap<String,menu_card> dishes=new TreeMap<>();

        dishes.put("Pasta", new menu_card("Pasta", 12.99, 4.5));
        dishes.put("Pizza", new menu_card("Pizza", 15.99, 4.8));
        dishes.put("Burger", new menu_card("Burger", 8.99, 4.2));
        dishes.put("Sushi", new menu_card("Sushi", 18.99, 4.9));
        dishes.put("Salad", new menu_card("Salad", 6.99, 4.1));

        for(Map.Entry<String,menu_card> entry1:dishes.entrySet()){
            System.out.println(entry1.getKey()+ " - " + entry1.getValue());
        }
    }
    
}
