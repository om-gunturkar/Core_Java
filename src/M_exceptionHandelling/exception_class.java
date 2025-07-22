package M_exceptionHandelling;

public class exception_class extends Exception{
    public exception_class(String message){
        super(message);
    }
    static void validAge(int age) throws exception_class{
        if(age<18){
            throw new exception_class("Age is not valid");
        }
        else{
            System.out.println("Age is valid ! Can proceed further");
        }
    }

    public static void main(String[] args) {
        try{
            validAge(17);
        }catch (exception_class e){
            System.out.println(e.getMessage());
        }
    }
}
