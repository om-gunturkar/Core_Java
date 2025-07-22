package N_collectionFramework.Collections_.Mapp;
import java.util.*;

public class mapping {
    public static void main(String[] args) {
        HashMap<String,Double> dishes=new HashMap<>();
        dishes.put("PavBhaji",120.00);
        dishes.put("pulav",50.00);
        dishes.put("dosa",20.00);

        System.out.println(dishes);

        for(Map.Entry<String,Double>entry1:dishes.entrySet()){ // take refrence entry1 and store it in entry one
            System.out.println(entry1.getKey()+" "+entry1.getValue()); // to take entry value and print get is used
        }
    }
}
