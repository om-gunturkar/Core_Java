package N_collectionFramework.Collections_;
import java.util.ArrayList;
import java.util.Iterator;
public class array_1 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<Integer>();
        //cars data
       data.add(200);
       data.add(400);
       data.add(100);
        System.out.println(data);

        //Iterator
        Iterator itr=data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int numbers:data){
            System.out.println("The for each loop number are "+numbers);
        }
    }
}
