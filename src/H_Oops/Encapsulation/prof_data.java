package H_Oops.Encapsulation;

public class prof_data {
    public static void main(String[] args) {
        collegeProfessor obj=new collegeProfessor();
        obj.setprofId(01);
        obj.setprofName("Akash");
        obj.setprofDept("Computer");
        obj.setprofSalary(15000);
        System.out.println("ID is :"+obj.getprofId());
        System.out.println("Name is :"+obj.getprofName());
        System.out.println("Dept is :"+obj.getprofDept());
        System.out.println("Salary is :"+obj.getprofName());

        System.out.println("The salary increment of professor is : "+obj.salaryIncrement());
    }
}
