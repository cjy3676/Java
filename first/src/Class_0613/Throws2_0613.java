package Class_0613;

public class Throws2_0613 {

	public void chul() throws ArithmeticException { // 멤버메소드
			int result= 100/0; 
	}

	public static void main(String[] args) {
		// chul(); => static메소드 내에서는 static만 접근가능
		Throws2_0613 th = new Throws2_0613();
		try {
			th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("호출한 곳에서 예외처리");
		}
		System.out.println();
	}
}
