package M_exceptionHandelling;

public class First {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        System.out.println(a+b);
        System.out.println(a-b);
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Exception caught "+e);
        }
        System.out.println(a*b);
    }


}
