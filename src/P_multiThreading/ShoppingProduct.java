package P_multiThreading;

public class ShoppingProduct{
    String OrderBy;
    String OrderItem;
    int OrderAmount;

    synchronized void Prod_Details(String OrderBy,String OrderItem,int OrderAmount){
        System.out.println("Enter your Name : "+OrderBy);
        System.out.println("Enter your Product Item : "+OrderItem);
        System.out.println("Enter your Product Amount : "+OrderAmount);

    }
}
