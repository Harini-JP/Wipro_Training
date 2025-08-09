package Day6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Only 5 elements: index 0 to 4

        try {
            System.out.println("Accessing 6th element: " + numbers[5]); // index 5 = 6th element
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Trying to access element beyond array limit.");
        } finally {
            System.out.println("Array access operation completed.");
        }
    }
}

