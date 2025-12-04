package H_Oops.METHOD_Overloading;

public class Test {

    public static void main(String[] args) {

        Calculate obj = new Calculate();
        obj.Add();         // No parameter
        obj.Add(2, 4);     // int, int
        obj.Add(1, 2.30f); // int, float
        obj.Add(1.2f, 10); // float, int
    }
}
/*
Output -
Addition: 5
Addition: 6
Addition: 3.3
Addition: 11.2
 */

