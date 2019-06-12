package first;
import java.util.Scanner;
public class cal_test10 
{
	int num1;
	int num2;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
	public void chul()
	{
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}
