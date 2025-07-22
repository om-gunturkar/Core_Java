package G_Array;

import java.util.Scanner;

public class array_task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double[] values=new double[3];
        for(int i=0;i<3;i++){
            values[i]=sc.nextDouble();

        }
        double maxno=values[0];
        if(values[1]>maxno){
            maxno=values[1];
        }if(values[2]>maxno){
            maxno=values[2];
        }
        System.out.println("The max no is "+maxno);
    }
}
