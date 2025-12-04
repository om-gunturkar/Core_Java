package I_file_Handelling.BufferedReaderInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name:");
        String name = br.readLine();

        System.out.println("Enter ID:");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Salary:");
        float salary = Float.parseFloat(br.readLine());

        Employee e1 = new Employee(id, name, salary);
        System.out.println(e1);
    }
}
