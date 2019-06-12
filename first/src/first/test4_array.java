package first;
public class test4_array 
{
	public static void main(String[] args) 
	{
		int total = 0;
		// 정수형 배열의 크기가 6인 arr4라는 배열을 만든다.
		int[] arr4 = new int[6];
		// 배열의 저장공간에 1부터 6까지의 값을 랜덤으로 입력한다.
		for(int i=0; i<arr4.length; i++)
		{
			arr4[i]=(int)(Math.random()*6)+1;
		}
		// 배열에 들어가는 값을 순서대로 출력한다.
		for(int i=0; i<arr4.length; i++)
		{
			total=total+arr4[i];
		}
		System.out.println(total);
	}
} 