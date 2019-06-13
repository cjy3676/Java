package Class_0613;

public class Try2_0613 {

	public static void main(String[] args) {
		int n = 6;
		int[] lotto = new int[6];
		int num = 100;
		int div = 0;

		try {
			lotto[n] = 100; // 에외발생된 catch만 실행됩니다.

			int result = num / div;
			String str = "hello";
			str = null;
			System.out.println(str.toString());
		} 
		
		catch (Exception e) {
			System.out.println("예외가 발생");
		}
		
		 System.out.println("계속되는 다음문장들");
	}
}
