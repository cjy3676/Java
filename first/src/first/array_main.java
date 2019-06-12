package first;
public class array_main 
{
	public static void main(String[] args) 
	{
		// 정수형 배열의 크기가 5인 test라는 배열을 만든다.
		int [] test = new int[5];
		// 배열의 저장공간에 1부터 5까지의 값을 입력한다.
		for(int i=0; i<test.length; i++)
		{
			test[i]=i+1;
		}
		// 배열에 들어가는 값을 순서대로 출력한다.
		for(int i=0; i<test.length; i++)
		{
			System.out.println(test[i]);
		}
	}
}
