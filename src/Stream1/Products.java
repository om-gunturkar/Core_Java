package Stream1;

public class Products {
    private int id;
    private String name;
    private double price;
    private String category;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public Products(int id,String name,double price,String category){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public String toString(){
        return "StreamExample [id=" + id + ", name = "+ name + ", price + "+price + ", category = "+category+" ]";
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getCategory(){
        return category;
    }

}
