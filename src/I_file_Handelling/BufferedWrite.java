package I_file_Handelling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWrite {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\new1.txt");
        BufferedOutputStream buffer = new BufferedOutputStream(file);

        String s1 = "Welcome to my class";
        buffer.write(s1.getBytes());

        buffer.flush();
        buffer.close();
        file.close();

        System.out.println("File successfully created using BufferedOutputStream!");
    }
}
