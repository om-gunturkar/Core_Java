package SynchronizedPrograms;

// Shared resource
public class Calculate {

    synchronized void getNum(int num) {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i * num);
        }
        System.out.println("****************");
    }
}

