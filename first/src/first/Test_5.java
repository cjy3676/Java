package first;
import java.util.Scanner;
public class Test_5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = 0;
		
		for (int i=num; i<=num2; i++) 
		{
			if (i % 3 == 0) 
			{
				num3 = num3 + i;
			}
			else
			{
				num3 = num3 + 0;
			}
		}
		System.out.println(num3);
	}
}
