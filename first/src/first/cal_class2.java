package first;
import java.util.Scanner;
public class cal_class2 
{
	int num;
	int num2;
	int num3;
	int total;
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	}
	public void cal() 
	{
		total = num + num2 + num3;
		System.out.println(total);
	}
}
