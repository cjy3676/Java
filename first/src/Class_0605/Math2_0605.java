package Class_0605;
public class Math2_0605 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[6];
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 1; j <= arr.length - 1; j++) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
