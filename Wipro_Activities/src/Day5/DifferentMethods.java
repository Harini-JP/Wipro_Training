package Day5;

interface Greeting {
    // void (abstract) method
    void sayHello();

    // default method
    default void sayWelcome() {
        System.out.println("Welcome to Wipro!");
    }

    // static method
    static void sayThanks() {
        System.out.println("Thanks for visiting!");
    }
}
class WiproEmployee implements Greeting {
    public void sayHello() {
        System.out.println("Hi! Happy to connect from Wipro.");
    }
}

public class DifferentMethods {
    public static void main(String[] args) {
        WiproEmployee emp = new WiproEmployee();

        emp.sayHello();     
        emp.sayWelcome();   
        Greeting.sayThanks(); 
    }
}

