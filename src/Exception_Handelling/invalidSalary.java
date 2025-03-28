package Exception_Handelling;

public class invalidSalary extends Exception{
    public invalidSalary(String message){
        super(message);
    }
}
class collegeStaff{
    String name;
    double salary;
    public collegeStaff(String name,double salary)throws invalidSalary{
        this.name=name;
        setSalary(salary);
    }

    private void setSalary(double salary) throws invalidSalary {
        if(salary<=0){
            throw new invalidSalary("Salary cannot be 0 or negative");
        }
        this.salary=salary;
    }
    public void displayDetaills(){
        System.out.println("Staff name is "+name);
        System.out.println("staff salary is "+salary);
    }
}
