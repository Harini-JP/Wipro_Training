package Day3;

class Person {
    String name;
    int age;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class StudentDetails extends Person {
    String course;

    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Course: " + course);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
    	StudentDetails s = new StudentDetails();
        s.name= "Harini";
        s.age = 21;
        s.course = "B.E Computer Science";

        s.displayStudentDetails();
    }
}
