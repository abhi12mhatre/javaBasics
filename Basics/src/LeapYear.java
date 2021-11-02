import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year:");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if( (input%100 == 0 && input%400 == 0) ) {
			System.out.println("the year "+ input + " is a leap year.");
		}
		else if (input%4 == 0) {
			System.out.println("the year "+ input + " is a leap year.");
		}
		else
			System.out.println("the year "+ input + " is not a leap year.");
	
		
		sc.close();
	}

}
