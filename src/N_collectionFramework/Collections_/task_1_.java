package N_collectionFramework.Collections_;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1_ {
    public static void main(String[] args) {
        ArrayList<task_1> employees=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of emp data u want to store");
        int numofempl=sc.nextInt();

        for(int i=0;i<numofempl;i++){
            System.out.println("Saving Employee data");
            System.out.println("Enter your name");
            String name=sc.next();
            System.out.println("Enter your age");
            int age= sc.nextInt();
            System.out.println("Enter your salary");
            double salary= sc.nextInt();

            task_1 emp=new task_1(name,age,salary);
            employees.add(emp);


            for(task_1 emp1:employees){
                emp1.Display();
            }
        }
    }
}
