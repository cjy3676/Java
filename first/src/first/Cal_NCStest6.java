package first;
public class Cal_NCStest6 
{
	int a;
	int b;
	int num = 0;
	
	Cal_NCStest6()
	{
		for(int i=1; i<=100; i++)
		{
			num = num + i;
		}
	}
	
	Cal_NCStest6(int a)
	{
		for(int i=1; i<=a; i++)
		{
			num = num + i;
		}
	}
	
	Cal_NCStest6(int a, int b)
	{
		for(int i=a; i<=b; i++)
		{
			num = num + i;
		}
	}
	
	public void chul()
	{
		System.out.println(num);
	}
}
