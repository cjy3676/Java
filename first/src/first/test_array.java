package first;
public class test_array 
{
	public static void main(String[] args) 
	{
		// arr�̶�� ������ �迭�� ũ��� 5�� �����.
		int[] arr = new int[5];
		// 1~5������ ���� ������ �Է��Ѵ�.
		// 4���濡 1, 3���濡 2, 2���濡 3, 1���濡 4 �Է�, 0���濡 5 �Է�
		/*for(int i=0; i<arr.length; i++)
		{
			arr[i]=5-i;
		} */
		
		for(int i=arr.length-1; i>=0; i--)
		{
			arr[i]=5-i;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		// ����ϱ�
	}
}
