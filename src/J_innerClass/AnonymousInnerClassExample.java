package J_innerClass;

interface Greeting {
    void sayHello();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Anonymous inner class that implements the Greeting interface
        Greeting englishGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        Greeting spanishGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hola!");
            }
        };

        englishGreeting.sayHello(); // Output: Hello!
        spanishGreeting.sayHello(); // Output: Hola!
    }
}
