package Day5;

// Final class: cannot be extended
final class Vehicle {

    // Final variable
    final int wheels = 4;

    // Final method
    final void displayType() {
        System.out.println("This is a Car.");
    }
}

public class FinalExample {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Number of wheels: " + v.wheels);
        v.displayType();
    }
}
