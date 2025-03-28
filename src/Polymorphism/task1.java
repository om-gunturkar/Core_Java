package Polymorphism;

public class task1 {

    public double calculateSalary(double baseSalary){
        return baseSalary;
    }
    public double calculateSalary(double baseSalary,double overtimehrs,double overtimerate){
        return baseSalary+(overtimehrs*overtimerate);
    }
    public double calculateSalary(double baseSalary,double salesamount,double commission,String name){
        System.out.println("The sales person name is "+name);
        return baseSalary+(salesamount*commission);
    }

    public static void main(String[] args) {
        task1 obj=new task1();
        System.out.println("The base salary is "+obj.calculateSalary(10000));
        System.out.println("Employee with overtime "+obj.calculateSalary(10000,5,100));
        System.out.println("Salesperson employee salary is "+obj.calculateSalary(10000,200,10,"Akash"));
    }
}
