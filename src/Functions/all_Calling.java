package Functions;

public class all_Calling {

    public static void Calculation(){
        int num1=100;
        int num2=200;
        System.out.println("The addition is " + " " + (num1+num2));

    }

    public static void main(String[] args) {
        all_Calling obj=new all_Calling();

        obj.Calculation(); //Object Reference Calling
        Calculation(); // Direct Calling
        all_Calling.Calculation(); // Class Reference Calling
    }
}
