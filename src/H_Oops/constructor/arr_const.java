package H_Oops.constructor;

public class arr_const {
    int [] numbers; // class variable named numbers of type integer array
    public arr_const(int [] numbers){ // H_Oops.constructor - takes an integer array as an argument and initializes the numbers variable with passed array
        this.numbers=numbers; // assignes passed array to the numbers variable to class ....this -> refers to current object
    }
    void printNumber(){  // used to print numbers in array
        System.out.println("Array Elements : ");
        for (int number:numbers){ // iterates through each number of numbers array , in each iteration the current element is assigned to variable number;

            System.out.println("Num are "+number);
        }
    }

    public static void main(String[] args) {
        int [] arrayelements ={1,2,3,4,5,6,7,8};
        arr_const obj=new arr_const(arrayelements);
        obj.printNumber();
    }
}
