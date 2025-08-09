package Day1;

public class Controlstatements {

	public static void main(String[] args) {
		 int number = 123;
		 if (number % 2 == 0) {
	            System.out.println(number + " is Even");
	        } else {
	            System.out.println(number + " is Odd");
	        }
		 
		 //SWITCH STATEMENTS
		 int day=2;
		 switch(day) {
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wednesday");
			 break;
		 case 4:
			 System.out.println("Thursday");
			 break;
		 case 5:
			 System.out.println("Friday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		default:
			 System.out.println("Invalid Day");
			
			 
		 }
	}
}
		
	        


