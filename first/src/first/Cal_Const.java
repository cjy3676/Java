package first;
public class Cal_Const 
{
	// 갯수가 정해지지 않음
	int[] arr;
	
	// 생선자를 통한 배열 객체 생성
	Cal_Const(int n)
	{
		arr = new int[n];
	}
	
	// 메소드를 통한 배열 객체 생성
	public void init(int n)
	{
		arr = new int[n];
	}
}
