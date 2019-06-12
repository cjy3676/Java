package first;
import java.util.Scanner;
public class for_5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = 0;
		
		if(num < num2) 
		{
		for (int i=num; i<=num2; i++)
		{
			num3 = num3 + i;
		}
		}
		else 
		{ 
			for (int i=num; i>=num2; i--) 
			{
				num3 = num3 + i;
			}
		}
		System.out.println(num3);
	}
}
