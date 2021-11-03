
public class Factorial {
	static int fact1 = 1;
	public static int recur(int number1) {
		
		if (number1>0)
		{
			fact1 = fact1*number1;
			number1--;	
			recur(number1);	
		}
		return fact1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int temp = number-1;
		int fact = number;//comment
				
		while(temp>0)
		{
			//System.out.println(fact);
			fact *= temp;
			temp--;
		}
		System.out.printf("Factorial of the number %d is: %d \n",number,fact);	
		
		System.out.println(recur(6));
	}

}
