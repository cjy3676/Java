package first;
public class test3_array 
{
	public static void main(String[] args) 
	{
		// ������ �迭�� ũ�Ⱑ 6�� arr3��� �迭�� �����.
		int[] arr3 = new int[6];
		// �迭�� ��������� 1���� 6������ ���� �������� �Է��Ѵ�.
		for(int i=0; i<arr3.length; i++)
		{
			arr3[i]=(int)(Math.random()*6)+1;
		}
		// �迭�� ���� ���� ������� ����Ѵ�.
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
	}
} 