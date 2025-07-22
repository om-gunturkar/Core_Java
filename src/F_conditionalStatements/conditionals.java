package F_conditionalStatements;

/*
Conditional statements allow different blocks of code to be executed based on whether a specified condition evaluates to true or false.
- if-else if-else :
    if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if none of the above conditions are true
}
- switch statement: Provides a way to execute different code blocks based on the value of a variable or expression. Useful for multiple choices.
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // code block
}



*/

public class conditionals {
    public static void main(String[] args) {
        int score = 75;

        // if-else if-else example
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // switch statement example
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very Good!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Needs Improvement.");
        }
    }
}
