package first;
public class Cal_Const3 
{
	int start;
	int end;
	int num;
	
	Cal_Const3(int start,int end)
	{
		for(int i=start; i<=end; i++)
		{
			num = num + i;
		}
	}
	
	public void output()
	{
		System.out.println(num);
	}
}
