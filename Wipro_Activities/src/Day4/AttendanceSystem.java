package Day4;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String status;

    void markAttendance(Scanner sc) {
        System.out.print("Enter Student name (or type 'Exit') :");
        name = sc.nextLine();

        if (name.equalsIgnoreCase("Exit")) {
            return;
        }

        System.out.print("Is " + name + " present? (P/A): ");
        status = sc.nextLine().toUpperCase();

        if (!status.equals("P") && !status.equals("A")) {
            System.out.println("Invalid input. Marking Absent by default.");
            status = "A";
        }
    }

    void display() {
        System.out.println(name + " - " + (status.equals("P") ? "Present" : "Absent"));
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            Student s = new Student();
            s.markAttendance(sc);

            if (s.name.equalsIgnoreCase("Exit")) {
                break;
            }

            students.add(s);
        }

        System.out.println("\n----------Attendance Report:----------");
        for (Student s : students) {
            s.display();
        }
    }
}
