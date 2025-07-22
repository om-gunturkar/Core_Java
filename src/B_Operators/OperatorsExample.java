package B_Operators;
/*
Operators are symbols that perform operations on variables and values.
Arithmetic Operators: +, -, *, /, % (modulus)
Assignment Operators: =, +=, -=, *=, /=, %=
Comparison (Relational) Operators: ==, !=, >, <, >=, <=
Logical Operators: && (AND), || (OR), ! (NOT)
Unary Operators: ++ (increment), -- (decrement), + (unary plus), - (unary minus), ! (logical NOT)
Bitwise Operators: &, |, ^, ~, <<, >>, >>> (for bit-level operations)
Ternary Operator: ? : (conditional operator)Operators are symbols that perform operations on variables and values.
Arithmetic Operators: +, -, *, /, % (modulus)
Assignment Operators: =, +=, -=, *=, /=, %=
Comparison (Relational) Operators: ==, !=, >, <, >=, <=
Logical Operators: && (AND), || (OR), ! (NOT)
Unary Operators: ++ (increment), -- (decrement), + (unary plus), - (unary minus), ! (logical NOT)
Bitwise Operators: &, |, ^, ~, <<, >>, >>> (for bit-level operations)
Ternary Operator: ? : (conditional operator)
*/
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0

        // Assignment Operators
        int c = a; // c = 10
        System.out.println("c = " + c);
        c += b;    // c = c + b = 10 + 5 = 15
        System.out.println("c += b -> c = " + c);

        // Comparison Operators
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a > b : " + (a > b));   // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y)); // false
        System.out.println("x || y : " + (x || y)); // true
        System.out.println("!x : " + (!x));         // false

        // Unary Operators
        int i = 5;
        System.out.println("i++ : " + (i++)); // 5 (i becomes 6)
        System.out.println("++i : " + (++i)); // 7 (i was 6, now 7)
    }
}
