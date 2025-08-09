package Project;
import java.util.Scanner;

public class ATM_Project {
	
	private double balance;
	private Scanner scanner;
	
	
    public ATM_Project() {
    	balance = 5000;
    	scanner=new Scanner(System.in);
    }
    
    public void displayMenu() {
    	System.out.println("---------ATM MENU--------");
    	System.out.println("1.CHECK BALANCE");
    	System.out.println("2.DEPOSIT");
    	System.out.println("3.WITH DRAW");
    	System.out.println("4.EXIT");
    	
    	
    }
    public void checkBalance(){
    	System.out.println("YOUR BALANCE IS" +balance);
    }
    
    public void deposit() {
    	System.out.println("ENTER THE AMOUNT TO DEPOSIT");
    	double amount=scanner.nextDouble();
    	if(amount>0) {
    		balance+=amount;
    		System.out.println(amount +"AMOUNT HAS BEEN DEPOISTED");
    	}else {
    		System.out.println("INVALID AMOUNT");
    		
    	}
    	}
    
    
    public void withDraw() {
    	System.out.println("ENTER THE AMOUNT TO WITHDRAW");
    	double amount=scanner.nextDouble();
    	if(amount>0 && amount<=balance) {
    		balance-=amount;
    		System.out.println(amount+ "HAS BEEN WITHDRAWN");
    	}else if(amount>balance){
    		System.out.println("INSUFFICIENT FUNDS,YOUR BALANCE IS:" +amount);
    		
    	}
    	else {
    		System.out.println("INVALID AMOUNT,ENTER POSITIVE AMOUNT");
    	}
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM_Project atm =new ATM_Project();
		
		while(true) {
			atm.displayMenu();
			System.out.println("ENTER YOUR CHOICE:");
			int choice = atm.scanner.nextInt();
			
			switch (choice) {
				case 1:
					atm.checkBalance();
					break;
				case 2:
					atm.deposit();
					break;
				case 3:
					atm.withDraw();
					break;
				case 4:
					System.out.println("Thankyou for visiting the ATM, GOOD BYE");
					break;
				default:
					System.out.println("INVALID OPTION,Please enter a correct Choice");

					
					
						
			}
		}
	}

}
