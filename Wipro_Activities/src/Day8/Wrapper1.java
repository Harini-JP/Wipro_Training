package Day8;

public class Wrapper1 {
    public static void main(String[] args) {
        double x = 45.67;

        Double d = x;  // Autoboxing: primitive double → Double object
        double y = d;  // Unboxing: Double object → primitive double

        System.out.println(y);
    }
}
