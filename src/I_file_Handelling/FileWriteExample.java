import java.io.File; // Required for File class operations
import java.io.FileOutputStream; // Required for writing data to a file
import java.io.IOException; // Required for handling I/O exceptions

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "Demo.txt"; // Name of the file to create
        String content = "Java is a programming language which is used for developing applications."; // Content to write

        try {
            File file = new File(fileName); // Create a File object

            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File '" + fileName + "' created successfully!");
            } else {
                System.out.println("File '" + fileName + "' already exists. Overwriting content.");
            }

            // Create a FileOutputStream to write data to the file
            FileOutputStream fos = new FileOutputStream(file);

            // Convert the string content to bytes and write to the file
            fos.write(content.getBytes());

            fos.close(); // Close the FileOutputStream
            System.out.println("Data successfully written to '" + fileName + "'.");

        } catch (IOException e) {
            // Catch and print any I/O exceptions that occur
            System.err.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}