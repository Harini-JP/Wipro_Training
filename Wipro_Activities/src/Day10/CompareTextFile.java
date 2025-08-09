package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareTextFile {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\Harini J\\Documents\\Notepad\\file1.txt";
        String file2 = "C:\\Users\\Harini J\\Documents\\Notepad\\file2.txt";
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        ) {
            String line1, line2;
            boolean areEqual = true;
            int lineNum = 1;

            while ((line1 = reader1.readLine()) != null & (line2 = reader2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    areEqual = false;
                    System.out.println("Difference found at line " + lineNum);
                    System.out.println("File1: " + line1);
                    System.out.println("File2: " + line2);
                    break;
                }
                lineNum++;
            }

            // Check if one file has extra lines
            if (areEqual && (reader1.readLine() != null || reader2.readLine() != null)) {
                areEqual = false;
                System.out.println("Files have different lengths.");
            }

            if (areEqual) {
                System.out.println("Both files are identical.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
