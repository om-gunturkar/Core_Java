package constructor;

public class this_withConstru {
    public this_withConstru(){
        this(10);
        System.out.println("Constructor 1 Called");
    }
    public this_withConstru(int a){
        this(20.0);
        System.out.println("Constructor 2 called");
    }
    public this_withConstru(double a){

        System.out.println("Constructor 3 called");
    }

    public static void main(String[] args) {
        this_withConstru obj=new this_withConstru();
    }
}
