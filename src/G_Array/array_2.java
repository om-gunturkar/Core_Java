package G_Array;

public class array_2 {
        public static void main(String[] args) {
            String[] fruits={"Apple","Mango","Kiwi","Papaya"};

            for(int i=0;i<fruits.length;i++){
                System.out.println(fruits[i]);
            }

            System.out.println("-----------------------------");

            for(String FruitsName:fruits){
                System.out.println(FruitsName);
            }
        }
    }


