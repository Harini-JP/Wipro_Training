package Day4;
/*
abstract class Wipro {
    void commonFeature() {
        System.out.println("Wipro provides system patent.");
    }

    abstract void device(); 
}

class Laptop1 extends Wipro {
    void device() {
        System.out.println("Laptop is given.");
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        Laptop1 lap = new Laptop1();
        lap.commonFeature();
        lap.device();
    }
}



abstract class Vehicle_drive {
	  abstract void speed();
	 abstract void brand();
	}
	class Car extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the car : 4km/hr");
			
		}
		void brand() {
			System.out.println("brand is: AUDI");
		}
		
		}
	class Bike extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the bike : 4km/hr");
		}
		void brand() {
			System.out.println("brand is: YAHAMA");
		}
	}
public class MainAbstract {
	public static void main(String[] args) {
		 Vehicle_drive vd = new Car();
		 vd.speed();
		 vd.brand();
		Vehicle_drive vd1 = new Bike();
		vd1.brand();
		vd1.speed();
	}

}
*/
import java.util.Scanner;

abstract class RentCalculator {
    abstract void tax(double rent);
}

class Apartment extends RentCalculator {
    void tax(double rent) {
        double tax = rent * 0.10;
        System.out.println("Final Apartment Rent: " + (rent + tax));
    }
}

class House extends RentCalculator {
    void tax(double rent) {
        double tax = rent * 0.20;
        System.out.println("Final House Rent: " + (rent + tax));
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category (Apartment/House): ");
        String type = sc.next();
        System.out.print("Enter base rent: ");
        double rent = sc.nextDouble();
        
/*we don’t know before checking the input whether to use Apartment or House.
So we declare it first (RentCalculator rc;)and then assign the correct object based on input.*/ 
        RentCalculator rc;  

        if (type.equalsIgnoreCase("Apartment"))
            rc = new Apartment();
        else if (type.equalsIgnoreCase("House"))
            rc = new House();
        else {
            System.out.println("Invalid category.");
            sc.close();
            return;
        }

        rc.tax(rent);
        sc.close();
    }
}



		


