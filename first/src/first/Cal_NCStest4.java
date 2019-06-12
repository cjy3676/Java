package first;
import java.util.Scanner;
public class Cal_NCStest4 
{
	int a;
	int b;
	int tot; 
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	public void output()
	{
		tot = 0;
		for(int i=a; i<=b; i++)
		{
			tot = tot + i;
		}
		System.out.println(tot);
	}
}
