package P_multiThreading;

public class Shop_main extends Thread{

    public static ShoppingProduct buy;
    String OrderBy;
    String OrderItem;
    int OrderAmount;
    public Shop_main(ShoppingProduct buy,String OrderBy, String OrderItem, int OrderAmount){
        this.buy=buy;
        this.OrderBy=OrderBy;
        this.OrderItem=OrderItem;
        this.OrderAmount=OrderAmount;

    }
    public void run(){
        buy.Prod_Details(OrderBy,OrderItem,OrderAmount);
    }

    public static void main(String[] args) {
        ShoppingProduct buy=new ShoppingProduct();
        Shop_main T5=new Shop_main(buy,"Om","Laptop",45000);
        Shop_main T6=new Shop_main(buy,"Soham","TV",60000);
        Shop_main T7=new Shop_main(buy,"Rohan","MObile",90000);
        T5.start();
        T6.start();
        T7.start();

    }
}
