package Class_0813;

public class Instance_Nested {
	// �Ӽ�
	int num;
	// �޼ҵ�
	public void output() {
		System.out.println(num);
	}
	// Ŭ����
	class Inner {
		int num2 = 99;
		public void output() {
			System.out.println(num2);
		}
	}
}
