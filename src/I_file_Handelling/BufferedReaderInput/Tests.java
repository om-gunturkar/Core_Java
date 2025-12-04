package I_file_Handelling.BufferedReaderInput;

import java.util.Scanner;

public class Tests {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Salary:");
        float salary = sc.nextFloat();

        Employee e1 = new Employee(id, name, salary);
        System.out.println(e1);

        sc.close();
    }
}