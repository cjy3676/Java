package first;

public class Cal_Const4  // class : 프로그램
{
	// 속성 : 변수
	int n;
	int total;
	
	// 생성자 : 기능
	// class 내의 속성의 초기값을 주는 것
    Cal_Const4()
    {
    	n=88;
    }
	
	// 메소드 : 기능
	public void input() 
	{
		n=99;
	}
	public void cal() // 계산식
	{
		for(int i=1; i<=n; i++)
		{
			total = total + i;
		}
	}
	public void chul() // 출력식
	{
		System.out.println(total);
	}
}
