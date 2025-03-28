package File_Handelling;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Product Name : ");
        String product_name=sc.nextLine();
        System.out.println("Product Type : ");
        String product_type=sc.nextLine();
        System.out.println("Product Price : ");
        String product_price=sc.nextLine();
        System.out.println("Product Avaliability : ");
        boolean product_avaliable=sc.nextBoolean();

        FileWriter file2=new FileWriter("C:\\Users\\omgun\\OneDrive\\Desktop\\7Mentors\\Java_\\src\\File_Handelling\\DEMO",true);
        file2.write("Product Name : "+product_name+"\n");
        file2.write("Product type : "+product_type+"\n");
        file2.write("Product price : "+product_price+"\n");
        file2.write("Product Avaliability : "+product_avaliable+"\n");
        file2.write("Product Name : "+product_name+"\n");
        file2.write("Product type : "+product_type+"\n");
        file2.write("Product price : "+product_price+"\n");
        file2.write("Product Avaliability : "+product_avaliable+"\n");
        System.out.println("The file is successfully written");
        file2.close();
    }
}
