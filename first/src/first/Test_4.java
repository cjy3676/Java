package first;
public class Test_4 
{
	public static void main(String[] args) 
	{
		int num = 0;
		for (int i=1; i<=100; i=i+2) 
		{
			num = num + i;
		}
		
		System.out.println(num);
		
		/* for (int i=1; i<=100; i++) 
		{
			if (i % 2 ==1)  // ������ 2�� ���� �������� 0(¦��), 1(Ȧ��)
				num = num + i;
		}
		
		System.out.println("Ȧ���� ��:"+num); */
	}
}
