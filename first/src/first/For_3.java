package first;
import java.util.Scanner;
public class For_3 
{

	public static void main(String[] args) 
	{
		/* int num = 0;
		for(int i=1; i<=100; i++) 
		{
			num = num + i;
		}
		System.out.println(num);
		*/
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = 0;
		for(int i=num; i<=num2; i++) 
		{
			num3 = num3 + i;
		}
		System.out.println(num3);
	}	
}
