package first;
// ������ �����ε��� �Ҷ� ��������
// 1. �Ű������� ������ �ڷ����� Ʋ���� �ȴ�.
// 2. �����ε��� �� ��� �Ű������� ���� ������ �ڵ������� �ȵȴ�.
public class Cal_Over1 
{
	int total;
	
	Cal_Over1() // 1���� 100������ ��
	{
		for(int i=1; i<=100; i++)
		{
			total = total + i;
		}
	}
	Cal_Over1(int a) // 1���� a������ ��
	{
		for(int i=1; i<=a; i++)
		{
			total = total + i;
		}
	}
	Cal_Over1(int a,int b) // a���� b������ ��
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
