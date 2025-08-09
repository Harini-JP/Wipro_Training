package Day3;

class StudentTest {
    String name;
    int age;
    String course;

    // Constructor
    StudentTest(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Student{
    public static void main(String[] args) {
    	StudentTest s1 = new StudentTest("Harini", 23, "Computer Science");
    	StudentTest s2 = new StudentTest("Praveen", 24, "Data Analytics");

        s1.displayInfo();
        System.out.println(); 
        s2.displayInfo();
    }
}
