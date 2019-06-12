package first;
public class Test20 
{
	public static void main(String[] args) 
	{
		int[] pay = {100,200,150,55,88,95,56,96,88};
		int num = 0;
		for (int i=0; i<=8; i++) 
		{
			num = num + pay[i];
		}
		System.out.println(num);
	}
}
