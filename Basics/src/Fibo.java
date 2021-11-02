
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8
		int a = 0;
		int b = 1;
		int c = a+b;
		
		while (a<10)
		{
			System.out.println(a);	//0 1 1
			a = b;					//1 1 2
			b = c;					//1 2 3
			c = a+b;				//2 3 5
		}
	}

}
