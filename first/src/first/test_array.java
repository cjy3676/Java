package first;
public class test_array 
{
	public static void main(String[] args) 
	{
		// arr이라는 정수형 배열의 크기는 5로 만든다.
		int[] arr = new int[5];
		// 1~5까지의 값을 역으로 입력한다.
		// 4번방에 1, 3번방에 2, 2번방에 3, 1번방에 4 입력, 0번방에 5 입력
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
		// 출력하기
	}
}
