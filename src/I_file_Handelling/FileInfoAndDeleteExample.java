import java.io.File; // Required for File class operations
import java.io.IOException; // Required for handling I/O exceptions

public class FileInfoAndDeleteExample {
    public static void main(String[] args) {
        String fileName = "temp_file.txt"; // Name of a temporary file for demonstration

        try {
            File file = new File(fileName); // Create a File object

            // Create a new file to demonstrate info and delete operations
            if (file.createNewFile()) {
                System.out.println("File '" + fileName + "' created for demonstration.");

                // Get file information
                System.out.println("\nFile Information for '" + fileName + "':");
                System.out.println("File Name: " + file.getName()); // Get the file name 
                System.out.println("Path: " + file.getAbsolutePath());
                System.out.println("Can Read: " + file.canRead()); // Check if readable 
                System.out.println("Can Write: " + file.canWrite()); // Check if writable 
                System.out.println("File Exists: " + file.exists()); // Check if exists 
                System.out.println("Size (bytes): " + file.length()); // Get file size

                // Delete the file
                if (file.delete()) {
                    System.out.println("\nFile '" + fileName + "' deleted successfully."); // Delete the file 
                } else {
                    System.out.println("\nFailed to delete file '" + fileName + "'.");
                }
            } else {
                System.out.println("File '" + fileName + "' already exists. Please delete it manually or change the filename to run this example.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}