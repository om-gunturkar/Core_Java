import java.io.File; // Required for File class operations
import java.io.FileInputStream; // Required for reading data from a file
import java.io.IOException; // Required for handling I/O exceptions

public class FileReadExample {
    public static void main(String[] args) {
        String fileName = "Demo.txt"; // Name of the file to read from

        try {
            File file = new File(fileName); // Create a File object

            // Check if the file exists before attempting to read
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file); // Create a FileInputStream

                System.out.println("Reading data from '" + fileName + "':");
                int character;
                // Read character by character until the end of the file is reached (-1)
                while ((character = fis.read()) != -1) {
                    System.out.print((char) character); // Cast int to char to print the actual character
                }
                System.out.println("\nSuccessfully read all data from '" + fileName + "'.");
                fis.close(); // Close the FileInputStream

            } else {
                System.out.println("File '" + fileName + "' does not exist.");
            }

        } catch (IOException e) {
            // Catch and print any I/O exceptions that occur
            System.err.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}