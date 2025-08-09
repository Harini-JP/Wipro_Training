package Day8;

import java.util.LinkedList;

public class Collections_Linkedlist {
    public static void main(String[] args) {
        // Create a LinkedList of course names
        LinkedList<String> courses = new LinkedList<>();

        // Add elements to the list
        courses.add("Java");
        courses.add("Python");
        courses.add("Data Science");
        courses.add("Web Development");

        // Display the entire list
        System.out.println("Course List: " + courses);

        // Add a course at the beginning
        courses.addFirst("C Programming");

        // Add a course at the end
        courses.addLast("Machine Learning");

        // Display updated list
        System.out.println("Updated Course List: " + courses);

        // Remove one course
        courses.remove("Python");

        // Display final list
        System.out.println("After removing Python: " + courses);
    }
}

