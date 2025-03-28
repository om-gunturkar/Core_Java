public class this_keyword {

    String name; //instance
    int age;
    public void PrintDetails(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        this_keyword obj=new this_keyword();
        obj.PrintDetails("Om",26);
        obj.display();
    }
}
