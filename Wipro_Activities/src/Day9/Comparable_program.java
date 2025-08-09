package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparable_program {

    public static void main(String[] args) {

        // Creating a Comparator to compare two integers
        Comparator<Integer> c1 = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i > j) 
                    return 1;
                else 
                    return -1;
            }
        };

        // Creating an ArrayList of integers
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(43);
        num.add(56);
        num.add(46);
        num.add(89);

        // Sorting the list using the custom Comparator
        Collections.sort(num, c1);

        // Printing the sorted list
        System.out.println(num);
    }
}

