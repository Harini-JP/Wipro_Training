package Day5;

abstract class Bank {
 public void greetCustomer() {
     System.out.println("Welcome to SBI Bank! We're happy to serve you.");
 }

 abstract void calculateInterest(double amount, double rate, int years);
}

class InterestCalculator extends Bank {

 public void calculateInterest(double amount, double rate, int years) {
     double interest = (amount * rate * years) / 100;
     System.out.println("Calculated Interest: ₹" + interest);
 }
}
public class BankService {
 public static void main(String[] args) {
     InterestCalculator customer = new InterestCalculator();
     customer.greetCustomer(); 
     customer.calculateInterest(10000, 5, 2); 
 }
}



