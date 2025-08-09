package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class Writer_Example {

    public static void main(String[] args) {
        try {
            // Create a FileWriter object to write data to the file
            FileWriter writer = new FileWriter("C:\\Users\\Harini J\\Documents\\Notepad\\file4.txt");

            // Write some data to the file
            writer.write("Hello, I am trying to find testing tools for ITC project\n");
            writer.write("Tools like automation and performance tools\n");

            // Close the file writer
            writer.close();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
