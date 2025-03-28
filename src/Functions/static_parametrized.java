package Functions;

public class static_parametrized {
    public static void Calc(int a, int b){
        System.out.println("The addition is : "+(a+b));
        System.out.println("The multiplication is : "+(a*b));
        System.out.println("The subtraction is : "+(a-b));
    }

    public static void main(String[] args) {
        Calc(100,30);
    }
}
