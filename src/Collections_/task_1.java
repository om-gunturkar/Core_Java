package Collections_;
import java.util.Iterator;
import java.util.ArrayList;
public class task_1 {
    String name;
    int age;
    double salary;

    public task_1(String name,int age,double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void Display(){
        System.out.println("name of employee is : "+name);
        System.out.println("age of employee is : "+age);
        System.out.println("salary of employee is : "+salary);


    }
}
