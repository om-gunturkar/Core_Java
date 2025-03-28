public class functions_java {
    String name1;
    int age1;
    public void PrintDetails(String name, int age){
        name1=name;
        age1=age;
    }
    public void display(){
        System.out.println(name1);
        System.out.println(age1);
    }

    public static void main(String[] args) {
        functions_java obj=new functions_java();
        obj.PrintDetails("Om",26);
        obj.display();
    }
}
