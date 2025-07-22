package D_Functions;
//two or more functions can have same names if they have diff parameters.
public class funcOverloading {
    static void func(int a){
        System.out.println(a);
    }
    static void func(String b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        func(22);
        func("om");
    }
}
