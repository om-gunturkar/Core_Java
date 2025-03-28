package Mapp;
import java.util.*;

class Product {
    String type;
    double price;
    String name;

    public Product(String type, double price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }
    public String toString() {
        return "Product Type: " + type + ", Name: " + name + ", Price: " + price;
    }
}

public class ProductStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Product> productMap = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for product " + i + ":");
            System.out.print("Product Type: ");
            String type = scanner.nextLine();
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            productMap.put(i, new Product(type, price, name));
        }

        System.out.println("\nStored Products:");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println("Product " + entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
