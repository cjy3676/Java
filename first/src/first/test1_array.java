package first;
public class test1_array 
{
	public static void main(String[] args) 
	{
		// 정수형 배열의 크기가 6인 arr1라는 배열을 만든다.
		int[] arr1 = new int[6];
		// 배열의 저장공간에 1부터 5까지의 값을 입력한다.
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=i+1;
		}
		// 배열에 들어가는 값을 순서대로 출력한다.
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
