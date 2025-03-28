import java.util.Scanner;

public class thisKEYWORD_task {
    String name;
    int age;
    double salary;
    public void SetDetails(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Employee details are :");
        System.out.println("The name of Employee is :"+name);
        System.out.println("The age of Employee is :"+age);
        System.out.println("The salary of Employee is :"+salary);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();

        thisKEYWORD_task obj=new thisKEYWORD_task();
        obj.SetDetails(name,age,salary);
        obj.displayDetails();
    }
}
