package I_file_Handelling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputDemo {

    public static void main(String[] args) throws IOException {

        FileOutputStream f1 = new FileOutputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\new1.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\new2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        String s1 = "Welcome to my class";
        bout.write(s1.getBytes());

        bout.writeTo(f1);
        bout.writeTo(f2);

        System.out.println("Data written to both files using ByteArrayOutputStream!");

        bout.close();
        f1.close();
        f2.close();
    }
}