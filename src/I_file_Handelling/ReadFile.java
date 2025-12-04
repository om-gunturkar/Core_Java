package I_file_Handelling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        FileInputStream f1 = new FileInputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\one.txt");

        int i;

        while ((i = f1.read()) != -1) {
            System.out.print((char) i);
        }

        f1.close();
    }
}
