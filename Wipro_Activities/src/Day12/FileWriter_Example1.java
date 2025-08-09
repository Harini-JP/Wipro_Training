package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Example1 {
    public static void main(String[] args) throws IOException {
        String content = "This is text written to file";

        // File path - make sure this is valid for your system
        FileWriter writer1 = new FileWriter("C:\\Users\\Harini J\\Documents\\Notepad\\file3.txt");
        writer1.write(content);
        writer1.close();

        System.out.println("Written successfully!");
    }
}
