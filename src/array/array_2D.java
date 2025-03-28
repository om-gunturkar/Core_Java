package array;

public class array_2D {
    public static void main(String[] args) {
        int [][] flats=new int[3][3];
        flats [0][0]=101;
        flats [0][1]=102;
        flats [0][2]=103;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;
        flats [2][0]=301;
        flats [2][1]=302;
        flats [2][2]=303;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
