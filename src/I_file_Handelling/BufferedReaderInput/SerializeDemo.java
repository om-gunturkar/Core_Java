package I_file_Handelling.BufferedReaderInput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) throws IOException {

        Employee e1 = new Employee(1, "Meena", 2000.4f);

        FileOutputStream fos = new FileOutputStream("D:\\CoreJava4-6oct\\FileInputOutput\\filedemos\\emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e1);
        oos.flush();
        oos.close();

        System.out.println("Object successfully stored!");
    }
}
