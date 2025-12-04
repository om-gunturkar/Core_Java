package I_file_Handelling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharBufferedWrite {

    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\ss1.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        buffer.write("Welcome to my class!!!!");
        buffer.flush();

        buffer.close();
        writer.close();
        System.out.println("File written successfully using BufferedWriter!");
    }
}
