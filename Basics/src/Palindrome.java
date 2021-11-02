
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1321;
		int temp = number;
		int reverse = 0;
	   
		while(temp>0)
		{
			reverse = (reverse*10)+(temp%10);
			temp = temp/10;
		}

		if(reverse == number)
			System.out.print("Yes!!!, the number is palindrome");
		else
			System.out.print("No!!!, the number is not palindrome");
	}

}
