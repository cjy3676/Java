package first;

public class Lotto 
{
	public static void main(String[] args) 
	{
		int[] lot = new int[6];
		// int num = (int)(Math.random()*45)+1; 1~45까지의 값 //
		for (int i=0; i<=5; i++) 
		{
			lot[i] = (int)(Math.random()*45)+1;
		}
		for (int i=0; i<=5; i++) 
		{
			System.out.println(lot[i]);
		}
	}
}
