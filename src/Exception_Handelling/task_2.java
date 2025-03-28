package Exception_Handelling;

public class task_2 {
    public static void main(String[] args) throws invalidSalary{
        collegeStaff stff1=new collegeStaff("Akash",9000);
        stff1.displayDetaills();
        collegeStaff stff2=new collegeStaff("Om",-7000);
        stff2.displayDetaills();
    }
}
