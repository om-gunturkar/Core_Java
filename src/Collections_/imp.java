package Collections_;
import java.awt.print.Book;
import java.util.Scanner;
import java.awt.*;
import java.util.LinkedList;

public class imp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Books> library=new LinkedList<>();
        System.out.println("Enter the number of data you want to store : ");
        int no_of_people=sc.nextInt();

        for(int i=0;i<no_of_people;i++){
            System.out.println("Saving your Data");
            System.out.println("Enter your id :");
            int id=sc.nextInt();
            System.out.println("Enter your name :");
            String name= sc.next();
            System.out.println("Enter your author :");
            String author= sc.next();
            System.out.println("Enter your quantity");
            int quantity=sc.nextInt();

            Books lib=new Books(id,name,author,quantity);
            library.add(lib);

            for(Books lib1:library){
                lib1.display();
            }

        }

    }
}
