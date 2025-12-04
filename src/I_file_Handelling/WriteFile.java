package I_file_Handelling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\one.txt");

        out.write(65); // Writes ASCII 'A'

        String s1 = "\nWelcome to my class";
        byte arr[] = s1.getBytes();    // converting string to byte array

        out.write(arr);

        System.out.println("File successfully created!");
    }
}
