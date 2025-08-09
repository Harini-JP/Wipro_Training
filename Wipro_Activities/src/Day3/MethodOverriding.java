package Day3;
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is Moving");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Bike();  
        v.run();              
    }
}

