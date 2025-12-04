package I_file_Handelling.BufferedReaderInput;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {

        PrintWriter console = new PrintWriter(System.out);
        console.write("Welcome to my class!!!");
        console.flush();
        console.close();

        PrintWriter file = new PrintWriter(new File("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\p1.txt"));
        file.write("File written using PrintWriter!");
        file.flush();
        file.close();

        System.out.println("PrintWriter Demo Completed!");
    }
}
