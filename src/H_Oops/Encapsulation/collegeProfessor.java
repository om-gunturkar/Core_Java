package H_Oops.Encapsulation;

public class collegeProfessor {
    private int profId;
    private String profName;
    private String profDept;
    private double profSalary;
    //getter function
    public int getprofId(){
        return profId;
    }
    public String getprofName(){
        return profName;
    }
    public String getprofDept(){
        return profDept;
    }
    public double getprofSalary(){
        return profSalary;
    }
    //setter function
    public void setprofId(int profId){
        this.profId=profId;

    }
    public void setprofName(String profName){
        this.profName=profName;
    }
    public void setprofDept(String profDept){
        this.profDept=profDept;
    }
    public void setprofSalary(double profSalary){
        this.profSalary=profSalary;
    }
    public double salaryIncrement(){
        return profSalary+10000;
    }
}
