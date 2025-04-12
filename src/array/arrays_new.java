package array;

public class arrays_new {
    public static void main(String[] args) {
        int a=19;

        String name="Om Gunturkar";
// array object are in HEAP
// HEAP objects are not continious i.e continious blocks like stack
//

//Syntax
//        datatype[] variable_name=new datatype[size];

        int[] students=new int[5];
        // or directly
//        datatype[] variable_name={array1,array2,...arrayn};

        int[] students1= {23,34,54,66,10};
        System.out.println(students1[0]); // 23 will be printed
        System.out.println(students1[1]); // 34 will be printed
        System.out.println(students1[2]); // 54 will be printed
        System.out.println(students1[3]); // 66 will be printed
        System.out.println(students1[4]); // 10 will be printed

        int[] rolls; // declaration of array , rolls is getting defined in stack // happens at compile time
        rolls=new int[5]; // actually here object is being created in memory (heap) // at run time memory is allocated// dyamic memory allocation

    }
}
