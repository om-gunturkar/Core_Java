package Stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,12,13,14,15,18,20,22,23,27,30);
        List<Integer> SortedEvenNo=numbers.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println("Sorted Elements of Array using Stream " + SortedEvenNo);
    }
}
