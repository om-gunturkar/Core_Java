package H_Oops.inheritance;

public class Super_Keyword1 extends Super_keyword{
    String color="Orange";
    void printColor(){
        System.out.println(super.color);// here this will call parent class color
    }

    public static void main(String[] args) {
        Super_Keyword1 obj=new Super_Keyword1();
        System.out.println(obj.color);
        obj.printColor();
    }
}
