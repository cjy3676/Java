package first;
public class test3_array 
{
	public static void main(String[] args) 
	{
		// 정수형 배열의 크기가 6인 arr3라는 배열을 만든다.
		int[] arr3 = new int[6];
		// 배열의 저장공간에 1부터 6까지의 값을 랜덤으로 입력한다.
		for(int i=0; i<arr3.length; i++)
		{
			arr3[i]=(int)(Math.random()*6)+1;
		}
		// 배열에 들어가는 값을 순서대로 출력한다.
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
	}
} 