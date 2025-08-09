package Day3;

public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 67, 12, 89, 34};

        int largest = numbers[0]; 

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
