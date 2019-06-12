package first;
// 생성자 오버로딩을 할때 주의할점
// 1. 매개변수의 갯수와 자료형이 틀려야 된다.
// 2. 오버로딩을 할 경우 매개변수가 없는 생성자 자동생성이 안된다.
public class Cal_Over1 
{
	int total;
	
	Cal_Over1() // 1부터 100까지의 합
	{
		for(int i=1; i<=100; i++)
		{
			total = total + i;
		}
	}
	Cal_Over1(int a) // 1부터 a까지의 합
	{
		for(int i=1; i<=a; i++)
		{
			total = total + i;
		}
	}
	Cal_Over1(int a,int b) // a부터 b까지의 합
	{
		for(int i=a; i<=b; i++)
		{
			total = total + i;
		}
	}
	public void chul()
	{
		System.out.println(total);
	}
}
