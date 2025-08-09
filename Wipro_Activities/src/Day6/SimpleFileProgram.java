package Day6;
import java.io.*;

public class SimpleFileProgram {
    public static void main(String[] args) {
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            // Write to the file in the Notepad folder
            writer = new FileWriter("C:\\Users\\Harini J\\Documents\\Notepad\\sample.txt");
            writer.write("Welcome to Java File Handling!");
            writer.close();
            System.out.println("File written successfully.\n");

            // Read from the file
            reader = new BufferedReader(new FileReader("C:\\Users\\Harini J\\Documents\\Notepad\\sample.txt"));
            String content = reader.readLine();
            System.out.println("File content: " + content);

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
            System.out.println("\nProgram completed.");
        }
    }
}
