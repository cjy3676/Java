package first;
public class test2_array 
{
	public static void main(String[] args) 
	{
		// ������ �迭�� ũ�Ⱑ 6�� arr2��� �迭�� �����.
		int[] arr2 = new int[6];
		// �迭�� ��������� 6���� 1������ ���� �Է��Ѵ�.
		for(int i=arr2.length-1; i>=0; i--)
		{
			arr2[i]=6-i;
		}
		// �迭�� ���� ���� ������� ����Ѵ�.
		for(int i=0; i<arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
	}
}
