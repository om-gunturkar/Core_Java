package constructor;

public class this_keyword {
    public void A(){
        System.out.println("Printing A Function");
        this.B();
    }
    public void B(){
        System.out.println("Printing B Function");
    }

    public static void main(String[] args) {
        this_keyword obj=new this_keyword();
        obj.A();
    }
}
