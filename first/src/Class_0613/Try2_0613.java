package Class_0613;

public class Try2_0613 {

	public static void main(String[] args) {
		int n = 6;
		int[] lotto = new int[6];
		int num = 100;
		int div = 0;

		try {
			lotto[n] = 100; // ���ܹ߻��� catch�� ����˴ϴ�.

			int result = num / div;
			String str = "hello";
			str = null;
			System.out.println(str.toString());
		} 
		
		catch (Exception e) {
			System.out.println("���ܰ� �߻�");
		}
		
		 System.out.println("��ӵǴ� ���������");
	}
}
