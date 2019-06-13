package Class_0613;

public class Throws_0613 {
	
	public void chul() { // 멤버메소드
		try {
			int result= 100/5; 
		}
		catch(ArithmeticException e)
		{
			System.out.println("예외발생");
		}
		
	}

	public static void main(String[] args) {
		// chul(); => static메소드 내에서는 static만 접근가능
		Throws_0613 th = new Throws_0613();
		th.chul();
	}

}
