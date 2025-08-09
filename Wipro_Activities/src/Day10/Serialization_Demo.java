package Day10;

import java.io.*; // For file and object serialization

// Serializable class

class Student_1 implements Serializable {
    private int rollno;
    private String name;

    // Constructor with arguments
    public Student_1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // No-argument constructor
    public Student_1() {}

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() for display
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
}

// Main class for serialization
public class Serialization_Demo {
    public static void main(String[] args) {
        // Create student object
        Student_1 std1 = new Student_1();
        std1.setRollno(23);       // Capital 'R' in setRollno
        std1.setName("Harini");

        try {
            // Create file to save object
            FileOutputStream out = new FileOutputStream("C:\\Users\\Harini J\\Documents\\Notepad\\javaFile.txt");

            // Convert object to byte stream
            ObjectOutputStream output = new ObjectOutputStream(out);

            // Write object to file
            output.writeObject(std1);

            System.out.println("Serialized data saved in file.");

            // Close resources
            output.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
