package Day6;
import java.util.Scanner;

public class FactorialExample {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try {
            System.out.print("Enter a number to find its factorial: ");
            num = sc.nextInt();

            if (num < 0) {
                throw new Exception("Cannot find factorial of negative numbers.");
            }

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Factorial calculation process ended.");
            
        }
        sc.close();
        
    }
   
}

