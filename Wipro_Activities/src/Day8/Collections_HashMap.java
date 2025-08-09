package Day8;

import java.util.HashMap;
import java.util.Map;

public class Collections_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store course names and their fees
        Map<String, Integer> courses = new HashMap<>();

        // Add course and fee data
        courses.put("Java", 5000);
        courses.put("Python", 4500);
        courses.put("Data Science", 8000);
        courses.put("Web Development", 6000);

        // Print only course names
        System.out.println("Courses: " + courses.keySet());

        // Print only fees
        System.out.println("Fees: " + courses.values());

        // Print course name and fee
        System.out.println("\nCourse Details:");
        for (String course : courses.keySet()) {
            System.out.println(course + ": ₹" + courses.get(course));
        }
    }
}

