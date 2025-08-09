package Day5;
/*
interface Walkable {
    void move();  
}

interface Runnable {
    void move();  
}

class Person implements Walkable, Runnable {
    public void move() {
        System.out.println("Person can walk and run.");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Person p = new Person();
        p.move();  
    }
}
*/

interface Device {
 void deviceType();
}

interface CompilePerformance {
 void deviceType(); 
}

class Desktop implements Device, CompilePerformance {
 public void deviceType() {
     System.out.println("Wipro provides device: DESKTOP");
     System.out.println("Code is compiled faster in Desktop");
 }
}

class Laptop implements Device, CompilePerformance {
 public void deviceType() {
     System.out.println("Wipro provides device: LAPTOP");
     System.out.println("Code is compiled slower in Laptop");
 }
}

public class MultipleInterface {
 public static void main(String[] args) {
     Device laptop = new Laptop();
     laptop.deviceType();

     Device desktop = new Desktop();
     desktop.deviceType();
 }
}
