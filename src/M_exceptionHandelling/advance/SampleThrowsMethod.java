package M_exceptionHandelling.advance;

import java.io.FileOutputStream;
import java.io.IOException;

public class SampleThrowsMethod {

    void show() throws IOException {

        FileOutputStream f1 = new FileOutputStream("D:\\CoreJava4-6oct\\ExceptionHandling\\filedemo\\xyz.txt");
        f1.write(65);

        System.out.println("File written successfully!");
    }

    public static void main(String[] args) {
        // Method defined but not called
    }
}
