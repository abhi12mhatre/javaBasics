
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2, 3, 5, 7, 11, 13, 17, 19 	
		int range = 20, counter = 0;
		
		for(int i=2; i<range; i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}	
			
			if (counter<2)
				System.out.print(i+" ");
			counter=0;
		}
	
	}
}
