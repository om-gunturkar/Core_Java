package Functions;

public class return_statement {
    public static float Addition(int num1,int num2){
        System.out.println(num1+num2);
        return 0.0f;
    }

    public String Name(String name){
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        Addition(10,20);

        return_statement obj=new return_statement();
        obj.Name("OM");
    }




}
