package Day6;
//Class to store two numbers
class Numbers {
//wanted to access the variables without creating an object
 static int a = 20;
 static int b = 0;
}

public class ExceptionExample {
 public static void main(String[] args) { 

     try {
         int result = Numbers.a / Numbers.b;  
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Error: Cannot divide " + Numbers.a+ " by zero.");
     } finally {
         System.out.println("Division operation completed.");
     }
 }
}

