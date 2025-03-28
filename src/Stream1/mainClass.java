package Stream1;

import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        ArrayList<Products> products=new ArrayList<>();
        products.add(new Products(1001,"Dell Laptop",40000.00,"Laptop"));
        products.add(new Products(1002,"OnePlus",30000.00,"mobile"));
        products.add(new Products(1003,"LG Fridge",50000.00,"fridge"));
        products.add(new Products(1004,"HP laptop",70000.00,"Laptop"));
        products.add(new Products(1005,"Iphone",150000.00,"mobile"));

        System.out.println("The original list is - ");
        products.forEach(System.out::println);
        double totalPrice=products.stream().filter(product1->"mobile".equalsIgnoreCase(
                product1.getCategory())).mapToDouble(Products::getPrice).sum();
        System.out.println("Total Price of mobile is "+totalPrice);
    }
}
