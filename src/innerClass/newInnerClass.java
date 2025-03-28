package innerClass;

import org.w3c.dom.ls.LSOutput;

public class newInnerClass {
    private int data=1000;
    class Inner{
        void Display(){
            System.out.println("This is class data function");
            System.out.println("The data is : "+data);
        }
    }

    public static void main(String[] args) {
        newInnerClass obj=new newInnerClass();
        newInnerClass.Inner in=obj.new Inner();
        in.Display();
    }
}
