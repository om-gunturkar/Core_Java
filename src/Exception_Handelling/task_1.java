package Exception_Handelling;
import java.util.Scanner;
public class task_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter your Age : ");
            int age=sc.nextInt();
            if(age<18 || age>65){
                throw new IllegalArgumentException("Age must be between 18 and 65");
            }
            System.out.println("Enter years of experience you have : ");
            int experience=sc.nextInt();
            if(experience<0 || experience<=3){
                throw new IllegalArgumentException("Experience must be minimum 3 years ");

            }
            System.out.println("Enter you are master or bachelors : ");
            sc.nextLine();
            String degree=sc.nextLine();
            if(!degree.equalsIgnoreCase("Bachelors") && !degree.equalsIgnoreCase("Masters"))
            {
                throw new IllegalAccessException("Degree not valid");
            }
            System.out.println("Application Processed Successfully");

            System.out.println("Your Detaills are : ");
            System.out.println("Age is : "+age);
            System.out.println("Years of experience is : "+experience);
            System.out.println("Degree is : "+degree);

            System.out.println("Can proceed for further round ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
