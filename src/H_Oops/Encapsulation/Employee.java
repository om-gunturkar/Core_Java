package H_Oops.Encapsulation;

public class Employee {
    private String name;
    private double salary;

//    public Employee(String name,double salary){
//        this.name=name;
//        this.salary=salary;
//
//    }
    //getter function
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    //setter function - used to set values - private to public convert kela
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
