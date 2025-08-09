package Day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Class implements Comparable to define natural ordering
class Collection_Comparable implements Comparable<Collection_Comparable> {
    private String name;
    private int age;

    public Collection_Comparable(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // compareTo method to sort by age in ascending order
    public int compareTo(Collection_Comparable other) {
        return this.age - other.age;
    }

    // toString method to print the name of the object
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Collection_Comparable> a = Arrays.asList(
            new Collection_Comparable("Prabal", 24),
            new Collection_Comparable("Sai", 25)
        );

        // Sorting the list using Comparable
        Collections.sort(a);

        // Printing the sorted list
        System.out.println(a);
    }
}
