package G_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10); // 10 is default size
        // here Integer is Wrapper Classes, we cannot pass Primitive data type

        list.add(20);
        list.add(220);
        list.add(45);
        list.add(23);
        list.add(456);
        list.add(67);
        list.add(990);
        list.add(76);

        System.out.println(list);
        list.set(0,99);
        System.out.println(list.contains(220));
        System.out.println(list);
        list.remove(3);

        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        // get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
