package first;
public class array_main 
{
	public static void main(String[] args) 
	{
		// ������ �迭�� ũ�Ⱑ 5�� test��� �迭�� �����.
		int [] test = new int[5];
		// �迭�� ��������� 1���� 5������ ���� �Է��Ѵ�.
		for(int i=0; i<test.length; i++)
		{
			test[i]=i+1;
		}
		// �迭�� ���� ���� ������� ����Ѵ�.
		for(int i=0; i<test.length; i++)
		{
			System.out.println(test[i]);
		}
	}
}
