package M_exceptionHandelling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample7 {

    public static void main(String[] args) {

        FileOutputStream f1;
        try {
            f1 = new FileOutputStream("D:\\CoreJava4-6oct\\ExceptionHandling\\filedemo\\xyz.txt");

            try {
                f1.write(65);
            } catch (IOException e) {
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("File created successfully!!!");
    }
}
