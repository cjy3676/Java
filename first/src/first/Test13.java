package first;
public class Test13 
{   // 13. 1부터 100까지의 짝수의 합을 출력하시오.
	public static void main(String[] args) 
	{
		int num = 0;
		
		for (int i=0; i<=100; i=i+2) 
		{
			num = num + i;
		}
		System.out.println(num);
	}
}
