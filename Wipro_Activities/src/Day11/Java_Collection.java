package Day11;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Java_Collection {
    public static void main(String[] args) {
        // List of courses (allows duplicates)
        ArrayList<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("python");
        courses.add("data structures");
        courses.add("java"); // duplicate

        System.out.println("Course List (ArrayList):");
        for (String c : courses) {
            System.out.println(c);
        }

        // Set of course codes (removes duplicates)
        Set<Integer> courseCodes = new HashSet<>();
        courseCodes.add(101);
        courseCodes.add(102);
        courseCodes.add(101); // duplicate
        courseCodes.add(104);

        System.out.println("\nCourse Codes (HashSet - No duplicates):");
        for (Integer code : courseCodes) {
            System.out.println(code);
        }

        // Map of course to duration/code
        Map<String, Integer> courseDuration = new HashMap<>();
        courseDuration.put("java", 101);
        courseDuration.put("python", 102);
        courseDuration.put("data structures", 101);
        courseDuration.put("java", 104); // overwritten
        courseDuration.put("java", 105); // overwritten again

        System.out.println("\nCourse Duration (HashMap - Key overwriting):");
        for (String c : courseDuration.keySet()) {
            System.out.println(c + " = " + courseDuration.get(c));
        }
    }
}


