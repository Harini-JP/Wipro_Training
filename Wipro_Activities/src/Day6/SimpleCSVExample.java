package Day6;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SimpleCSVExample {
    public static void main(String[] args) {
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            // Writing to CSV file
            writer = new FileWriter("C:\\Users\\Harini J\\Documents\\Notepad\\data.csv");
            writer.write("Name,Age,City\n");
            writer.write("Harini,23,Hosur\n");
            writer.write("Praveen,25,Bangalore\n");
            System.out.println("CSV file written successfully.\n");
            writer.close();

            // Reading from CSV file
            reader = new BufferedReader(new FileReader("C:\\Users\\Harini J\\Documents\\Notepad\\data.csv"));
            String line;
            System.out.println("Reading CSV file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
            System.out.println("\nProgram completed.");
        }
    }
}
