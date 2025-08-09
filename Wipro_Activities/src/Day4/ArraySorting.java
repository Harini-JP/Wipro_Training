package Day4;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        String[] courses = {"Java", "Python", "Web Development", "C Programming", "Data Structures", "Machine Learning", "SQL", "Cyber Security"};

        System.out.println("Courses before sorting:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }

        Arrays.sort(courses); // Sorting the array

        System.out.println("\nCourses after sorting:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }

    }
}

