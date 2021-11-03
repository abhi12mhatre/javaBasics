import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("NOTE: please provide only the numbers and the operations to be performed.");
		System.out.println("enter the 1st number:");
		
		Scanner sc = new Scanner(System.in);
		double input1 = sc.nextDouble();
		
		System.out.println("enter the 2nd number:");
		double input2 = sc.nextDouble();
		
		System.out.println("enter the operation to be performed:");
		String operation = sc.next();
		
		double result = 0;
		
		switch(operation) {
		case "+":
			result = input1+input2;
			System.out.println(result);
			break;
		
		case "-":
			result = input1-input2;
			System.out.println(result);
			break;
			
		case "*":
			result = input1*input2;
			System.out.println(result);
			break;
			
		case "/":
			result = input1/input2;
			System.out.println(result);
			break;
			
		case "%":
			result = input1%input2;
			System.out.println(result);
			break;
			
		default:
			System.out.println("error!!");
				
		}
			
		//comment	
		sc.close();
		
		
	}

}
