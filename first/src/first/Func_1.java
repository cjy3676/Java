package first;
import java.util.Scanner;
public class Func_1 
{
	int num1;
	int num2;
	int hap;
	
	public void input() //변수를 입력하는 방법
	{
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	
	public void add() 
	{
		hap=num1+num2;
	}
	
	public void add1(int num3,int num4) //매개변수를 주어지는 방법
	{
		hap=num3+num4;
	}
	
	public void chul()
	{
		System.out.println("합: "+hap);
	}
}
