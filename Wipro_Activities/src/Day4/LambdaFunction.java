package Day4;

interface Addable {
    int add(int a, int b);
}

public class LambdaFunction {
    public static void main(String[] args) {
        // Lambda expression to add two numbers
        Addable addition = (a, b) -> a + b;

        // Calling the add method
        int result = addition.add(10, 20);
        System.out.println("Sum: " + result);
    }
}



