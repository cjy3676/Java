package Class_0605;
public class Math_0605 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[2];
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
		}

		// 0�� �ε����� ���� ���� ������ �ְ� ���α׷��� �Ͻÿ�.
		if (arr[0] > arr[1]) { // 0�� 1�� ���� ��ȯ
			tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
