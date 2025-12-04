package I_file_Handelling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class ReadMultipleFiles {

    public static void main(String[] args) throws IOException {

        InputStream f1 = new FileInputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\one.txt");
        InputStream f2 = new FileInputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\two.txt");

        SequenceInputStream seq = new SequenceInputStream(f1, f2);

        int i;

        while ((i = seq.read()) != -1) {
            System.out.print((char) i);
        }

        seq.close();
        f1.close();
        f2.close();
    }
}
