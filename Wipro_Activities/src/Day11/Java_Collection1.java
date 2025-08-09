package Day11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java_Collection1 {
    public static void main(String[] args) {
        // Initial list of salaries
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4000, 3000, 5000, 1000));
        a.add(6000);
        a.add(7000);

        System.out.println("Original List: " + a);

        // Sorting the list
        Collections.sort(a);
        System.out.println("Sorted List: " + a);

        // Searching for 5000 in sorted list
        int index = Collections.binarySearch(a, 5000);
        System.out.println("Index of 5000 in sorted list: " + index);

        // Reversing the list
        Collections.reverse(a);
        System.out.println("Reversed List: " + a);
    }
}

