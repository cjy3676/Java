package Class_0613;

public class Try_0613 {

	public static void main(String[] args) {
		int n = 6;
		int[] lotto = new int[6];
		int num = 100;
		int div = 0;
		
		try {
			lotto[n] = 100; // ���ܹ߻��� catch�� ����˴ϴ�.
			
			int result = num/div;
			String str = "hello";
			str = null;
			System.out.println(str.toString());	
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("0���� ������");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Over");
		}
		
		catch (NullPointerException e) {
			// ���ܹ߻��� �ʿ��� ��ġ(���೻��)
			System.out.println("str�� null���� �ֽ��ϴ�");
		}
		
		catch (Exception e) {
			System.out.println("�������ϴ� ���ܹ߻�");
		}
		
		finally // ������ �߻����θ� ������ ������ ����
		{
			System.out.println("finally �Դϴ�");
		}
		
		System.out.println("hollo");
	}
}
