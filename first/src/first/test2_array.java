package first;
public class test2_array 
{
	public static void main(String[] args) 
	{
		// 정수형 배열의 크기가 6인 arr2라는 배열을 만든다.
		int[] arr2 = new int[6];
		// 배열의 저장공간에 6부터 1까지의 값을 입력한다.
		for(int i=arr2.length-1; i>=0; i--)
		{
			arr2[i]=6-i;
		}
		// 배열에 들어가는 값을 순서대로 출력한다.
		for(int i=0; i<arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
	}
}
