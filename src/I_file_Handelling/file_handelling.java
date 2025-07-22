package I_file_Handelling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handelling {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data : ");
        String name=sc.next();

        FileWriter file1=new FileWriter("C:\\Users\\omgun\\OneDrive\\Desktop\\Java\\Demo.txt",true);

        file1.write("Name : "+name+"\n");
        file1.close();

        System.out.println("File created successfully");
    }
}
