package first;
import java.util.Scanner;
public class If_2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num > num2) 
		{
		    System.out.println(num-num2);	
		}
		else 
		{
			System.out.println(num2-num);
		}
	}
}
