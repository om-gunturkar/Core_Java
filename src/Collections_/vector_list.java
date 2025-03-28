package Collections_;
import java.util.Iterator;
import java.util.Vector;

public class vector_list {
    public static void main(String[] args) {
        Vector<Integer> data=new Vector<Integer>();
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
