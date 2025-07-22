package N_collectionFramework.Collections_;
import java.util.ArrayList;
import java.util.Iterator;
public class Arrray {
    public static void main(String[] args) {
        ArrayList<String> data=new ArrayList<String>();
        //cars data
        data.add("BMW");
        data.add("Audi");
        data.add("Kia");
        data.add("Thar");
        System.out.println(data);

        //Iterator
        Iterator itr=data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
