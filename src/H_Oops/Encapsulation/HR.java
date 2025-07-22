package H_Oops.Encapsulation;

public class HR {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setName("Akash");
        obj.setSalary(50000);
        System.out.println("Name is "+obj.getName());
        System.out.println("Salary is "+obj.getSalary());
    }
}
