package Class_0805;

public class class_this { // this : ���� �ڽ��� ��ü�� �θ��� �̸� 
	// Ŭ�����ȿ� ���Ե� ��� => �Ӽ��� �޼ҵ�
	int num1 = 90;
	int num2 = 80;
	
	public void output() {
		int num1 = 70;
		int num2 = 60;
		System.out.println(num1); // ���� �޼ҵ��� num1����
		System.out.println(this.num1); // Ŭ������ ������� num1
	}
}
