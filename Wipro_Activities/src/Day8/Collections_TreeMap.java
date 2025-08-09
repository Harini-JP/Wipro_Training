package Day8;

import java.util.Map;
import java.util.TreeMap;

public class Collections_TreeMap {
    public static void main(String[] args) {
        // TreeMap stores entries in sorted order of keys
        Map<String, Integer> courses = new TreeMap<>();

        // Add course names and their fees
        courses.put("Java", 5000);
        courses.put("Python", 4500);
        courses.put("Data Science", 8000);
        courses.put("Web Development", 6000);

        // Print course names (sorted)
        System.out.println("Courses (Sorted): " + courses.keySet());

        // Print only fees
        System.out.println("Fees: " + courses.values());

        // Print course and fee
        System.out.println("\nCourse Details:");
        for (String course : courses.keySet()) {
            System.out.println(course + ": ₹" + courses.get(course));
        }
    }
}
