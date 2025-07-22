package D_Functions;
// using 2 variable using same names within the same name that overlaps
public class shadowing {
    static int x=90; // here x is going be avaliable in box of shadowing class // shadowed
    public static void main(String[] args) {
        System.out.println(x);// 90
        int x=40;
        System.out.println(x);//40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
