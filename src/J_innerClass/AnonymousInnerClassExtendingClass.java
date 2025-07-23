package J_innerClass;

class Person {
    void eat() {
        System.out.println("Person is eating.");
    }
}

public class AnonymousInnerClassExtendingClass {
    public static void main(String[] args) {
        // Anonymous inner class that extends the Person class
        Person student = new Person() {
            @Override
            void eat() {
                System.out.println("Student is eating lunch.");
            }
        };

        Person worker = new Person() {
            @Override
            void eat() {
                System.out.println("Worker is having a quick bite.");
            }
        };

        student.eat(); // Output: Student is eating lunch.
        worker.eat(); // Output: Worker is having a quick bite.
    }
}
