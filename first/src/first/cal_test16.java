package first;
import java.util.Scanner;
public class cal_test16 
{
	int num;
	int total;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	}
	
	public void hap()
	{
		for(int i=1; i<=num; i++)
			total = total + i;
	}
	
	public void chul()
	{
		System.out.println(total);
	}
}
