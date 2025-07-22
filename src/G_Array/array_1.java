package G_Array;

public class array_1 {
    public static void main(String[] args) {
        int[] salary=new int[5];
        salary[3]=10000;
        salary[2]=30000;
        salary[1]=20000;
        System.out.println(salary[0]); //calling by index number

        for(int i=0;i<salary.length;i++){
            System.out.println("Salary is : "+ salary[i]);
        }
    }
}
