package I_file_Handelling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharBufferedRead {

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new FileReader("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\ss1.txt"));

        int i;
        while ((i = buffer.read()) != -1) {
            System.out.print((char) i);
        }

        buffer.close();
    }
}
