package I_file_Handelling.BufferedReaderInput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e = (Employee) ois.readObject();
        System.out.println(e);

        ois.close();
    }
}
