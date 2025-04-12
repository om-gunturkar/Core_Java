package Functions;
import java.util.Arrays;
public class varArgs {
    public static void main(String[] args) {
        fun(2,4,5,7,8,45,66,78,44);
        multiple(2,5,"om","gukesh");
    }
    static void fun(int ...v){ // here ... states we are taking array of integers
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){ //variable length arguements should always come at end
        System.out.println();
    }
}
