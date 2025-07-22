package N_collectionFramework.Collections_;

public class Books {
    int id;
    String name;
    String author;
    int quantity;

    public Books(int id,String name,String author,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.quantity=quantity;
    }
    public void display(){
        System.out.println("The id is : "+id);
        System.out.println("The name is : "+name);
        System.out.println("The author is : "+author);
        System.out.println("The quantity is : "+quantity);
    }
}
