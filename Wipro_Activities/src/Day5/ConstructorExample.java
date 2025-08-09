package Day5;

class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating object and calling constructor
        Student s1 = new Student("Harini", 22);
        s1.display();
    }
}

