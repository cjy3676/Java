package Class_0613;

public class Try_0613 {

	public static void main(String[] args) {
		int n = 6;
		int[] lotto = new int[6];
		int num = 100;
		int div = 0;
		
		try {
			lotto[n] = 100; // 에외발생된 catch만 실행됩니다.
			
			int result = num/div;
			String str = "hello";
			str = null;
			System.out.println(str.toString());	
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("0으로 못나눔");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Over");
		}
		
		catch (NullPointerException e) {
			// 예외발생시 필요한 조치(진행내용)
			System.out.println("str에 null값이 있습니다");
		}
		
		catch (Exception e) {
			System.out.println("알지못하는 예외발생");
		}
		
		finally // 예외의 발생여부를 떠나서 무조건 실행
		{
			System.out.println("finally 입니다");
		}
		
		System.out.println("hollo");
	}
}
