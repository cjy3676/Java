package first;
public class Class_0604 
{
	public static void main(String[] args) 
	{
		// charAt
		// ���ڴ� 1,3�� / ���ڴ� 2,4��
		String sum1 = "123456-1234567";

		// System.out.println(str.charAt(7)); str.charAt(n): n�� ������ �ڸ���ȣ
		
		char sum2 = sum1.charAt(7); // �ֹι�ȣ�� ������ ������ �� �ִ� ��ȣ�� �����´�.
		
		if (sum2 == '1' || sum2 == '3') {
			System.out.println("���� �Դϴ�.");
		} 
		else {
			System.out.println("���� �Դϴ�.");
		}
		
		// length
		String sum3 = "hello java";
		System.out.println(sum3.length()); // ���ڿ��� ���̸� ���ϴ� �޼ҵ�
		
		// replace
		String sum4 = "hello world"; // ���ڸ� �����ϴ� �޼ҵ�
		String new_sum5 = sum4.replace("world", "java");
		System.out.println(new_sum5);
		
		// trim
		String sum6 = "       hello       java world";
		System.out.println(sum6.length());
		String trim_sum6 = sum6.trim();
		System.out.println(trim_sum6.length());
		System.out.println(trim_sum6);
		
		// split
		String sum7 = "���̾��,�����̴���/�丣-ĸƾ�Ƹ޸�ī";
		String[] name = sum7.split(",|/|-"); // ,/-�� �����ڷ� �Ͽ� ������ => �迭���� ����
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]); // i�� �迭 ��ȣ
		}
		
		// String class
		String nam = "Iron man";
		String sum8=new String("Iron man");
		
		if(nam.equals(sum8))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
		// Integer
		Integer num = 100;
		Integer num1 = new Integer(90);

		int a = num.intValue();
		short b = num1.shortValue();
		byte c = num.byteValue();
		long d = num1.longValue();
		String ss = num.toString();

		String num3 = new String("123");
		int su = Integer.parseInt(num3); 
		
		// Math
		double I = Math.random(); // return ���� double�� => �Ǽ�
		long R = Math.round(1.6); // return ���� long => �ݿø�
		double O = Math.ceil(1.4); // return ���� double => �ø�
		double N = Math.floor(1.5); // return ���� double => ����
		Double M = Math.floor(1.5);
		float A = (float)1.5;
		float S = 1.5F;
		
		// double���� ���������� �ٲٱ�
		int f = (int) O;
		
		// Double class
		int g = M.intValue();
		
	}
}
       