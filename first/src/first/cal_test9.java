package first;
public class cal_test9 
{
	int num=99;
	int num2=88;
	int num3;
	
	public void exchange()
	{
		num3=num;
		num=num2;
		num2=num3;
	}
	
	public void chul()
	{
		System.out.println(num+" "+num2);
	}
}
