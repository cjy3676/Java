package first;
public class test4_array 
{
	public static void main(String[] args) 
	{
		int total = 0;
		// ������ �迭�� ũ�Ⱑ 6�� arr4��� �迭�� �����.
		int[] arr4 = new int[6];
		// �迭�� ��������� 1���� 6������ ���� �������� �Է��Ѵ�.
		for(int i=0; i<arr4.length; i++)
		{
			arr4[i]=(int)(Math.random()*6)+1;
		}
		// �迭�� ���� ���� ������� ����Ѵ�.
		for(int i=0; i<arr4.length; i++)
		{
			total=total+arr4[i];
		}
		System.out.println(total);
	}
} 