package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SAmple33 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(13);
        list.add(90);
        list.add(11);
        list.add(123);
        list.add(11);

        System.out.println("Before Sort : " + list);
        Collections.sort(list);
        System.out.println("After Sort  : " + list);
    }
}

