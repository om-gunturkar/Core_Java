package I_file_Handelling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedRead {

    public static void main(String[] args) throws Exception {

        FileInputStream file = new FileInputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\new1.txt");
        BufferedInputStream buffer = new BufferedInputStream(file);

        int i;
        while ((i = buffer.read()) != -1) {
            System.out.print((char) i);
        }

        buffer.close();
        file.close();
    }}
