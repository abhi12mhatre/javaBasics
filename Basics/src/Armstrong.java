
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		int temp1 = number;
		int temp2 = number;
		int temp3 = 1;
		int size = 0;
		int result = 0;
		
		while(temp1 != 0)
		{
			temp1 /= 10;
			size++;
		}
		temp1 = number;
		
		while(temp2 != 0)
		{
			temp1 = temp2%10;
			temp2 /= 10;
			for(int i = 0;i < size;i++)
			{				
				temp3 *= temp1;
			}
			result += temp3;
			temp3 = 1;
		}
		System.out.println(result);
		if(number == result)
			System.out.println("the number "+ number +" is an armstrong number");
	}

}
