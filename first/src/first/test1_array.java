package first;
public class test1_array 
{
	public static void main(String[] args) 
	{
		// ������ �迭�� ũ�Ⱑ 6�� arr1��� �迭�� �����.
		int[] arr1 = new int[6];
		// �迭�� ��������� 1���� 5������ ���� �Է��Ѵ�.
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=i+1;
		}
		// �迭�� ���� ���� ������� ����Ѵ�.
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
