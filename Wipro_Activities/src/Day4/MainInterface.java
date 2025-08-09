package Day4;
/*
interface Wipro {
    void commonFeature();
    void device();
}

class Laptop implements Wipro {
    public void commonFeature() {
        System.out.println("Wipro provides system patent.");
    }

    public void device() {
        System.out.println("Laptop is given.");
    }
}

public class MainInterface {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.commonFeature();
        l.device();
    }
}
*/
/*
interface Vehicle_drive{
	void brand();
	void speed();
}
class Car implements Vehicle_drive{
	public void brand(){
		 System.out.println("The Brand Name is: AUDI");
	}
	public void speed(){
		 System.out.println("The speed of audi is 100km/hr");
	}
}
class Bike implements Vehicle_drive{
	public void brand(){
		 System.out.println("The Brand Name is: YAHAMA");
		}
	public void speed(){
		 System.out.println("The speed of yahama is 50km/hr");
	}
}
public class MainInterface{
	public static void main(String[] args) {
		Vehicle_drive car= new Car();
		car.brand();
		car.speed();
		Vehicle_drive bike= new Bike();
		bike.brand();
		bike.speed();
}
	}

*/

import java.util.Scanner;

//Define an interface
interface RentCalculator1 {
 void tax(double rent);
}

//Implement the interface in Apartment class
class Apartment1 implements RentCalculator1 {
 public void tax(double rent) {
     double tax = rent * 0.10;
     System.out.println("Final Apartment Rent: " + (rent + tax));
 }
}

//Implement the interface in House class
class House1 implements RentCalculator1 {
 public void tax(double rent) {
     double tax = rent * 0.20;
     System.out.println("Final House Rent: " + (rent + tax));
 }
}

public class MainInterface {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter category (Apartment/House): ");
     String type = sc.next();
     System.out.print("Enter base rent: ");
     double rent = sc.nextDouble();

     RentCalculator1 rc;

     if (type.equalsIgnoreCase("Apartment"))
         rc = new Apartment1();
     else if (type.equalsIgnoreCase("House"))
         rc = new House1();
     else {
         System.out.println("Invalid category.");
         sc.close();
         return;
     }

     rc.tax(rent);
     sc.close();
 }
}

