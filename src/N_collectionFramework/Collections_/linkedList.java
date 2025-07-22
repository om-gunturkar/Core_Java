package N_collectionFramework.Collections_;

import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<String> data=new LinkedList<String>();
        data.add("Shubham");
        data.add("akash");
        data.add("Rohan");
        data.add("Neha");

//        for(String name:data){
//            System.out.println(name);
//        }
        //adding through index number
        data.remove(1); //removes from list
//        data.add(0,"Gaurav");

        data.removeFirstOccurrence("Gaurav");

        for(String name:data){
            System.out.println(name);
        }
    }



}
