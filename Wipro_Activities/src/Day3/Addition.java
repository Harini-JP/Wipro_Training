package Day3;

class Sum1 {
    public static void total(int a, int b) {
        int sum = a + b;
        System.out.println("The total is: " + sum);
    }
}

public class Addition {
    public static void main(String[] args) {
        Sum1.total(10, 20);
    }

    // this static method to expose Sum1.total()
    public static void total(int a, int b) {
        Sum1.total(a, b);
    }
}
