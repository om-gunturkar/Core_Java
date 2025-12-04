package I_file_Handelling;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputDemo {

    public static void main(String[] args) throws IOException {

        byte[] array = { 67, 98, 78, 91 };

        ByteArrayInputStream bin = new ByteArrayInputStream(array);

        int i;
        while ((i = bin.read()) != -1) {
            System.out.println(i + "   " + (char) i);
        }

        bin.close();
    }
}
