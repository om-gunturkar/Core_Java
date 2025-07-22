package N_collectionFramework.Collections_;
import java.util.Iterator;
import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        TreeSet<String> data=new TreeSet<>();
        //cars data
        data.add("BMW");
        data.add("Audi");
        data.add("Kia");
        data.add("Thar");
        data.add("BMW");

        System.out.println(data);

        //Iterator
        Iterator itr=data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
