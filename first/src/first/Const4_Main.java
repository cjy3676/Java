package first;
public class Const4_Main 
{
	public static void main(String[] args) 
	{
		Cal_Const4 c1 = new Cal_Const4();
		
		// 1. 메인 함수내에서 변수에 직접 전달
		c1.n=100;
		c1.cal();
		c1.chul();
		
		// 2. 메소드를 이용
		Cal_Const4 c2 = new Cal_Const4();
		c2.input();
		c2.cal();
		c2.chul();
		
		// 3. 생성자를 이용해서
		Cal_Const4 c3 = new Cal_Const4();
		c3.cal();
		c3.chul();
	}
}
