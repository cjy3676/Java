package first;
import java.util.Scanner;
public class Func_1 
{
	int num1;
	int num2;
	int hap;
	
	public void input() //������ �Է��ϴ� ���
	{
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	
	public void add() 
	{
		hap=num1+num2;
	}
	
	public void add1(int num3,int num4) //�Ű������� �־����� ���
	{
		hap=num3+num4;
	}
	
	public void chul()
	{
		System.out.println("��: "+hap);
	}
}
