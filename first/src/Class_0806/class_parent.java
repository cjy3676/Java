package Class_0806;

public class class_parent {
	// ��� : �ٸ� Ŭ������ �Ӽ�, �޼ҵ带 ���� Ŭ������ ���Խ�Ű�� ����
	// AŬ������ ���� ���� BŬ������ ����Ѵ�
	// ������ Ŭ������ ����� �� �ִ� A a = new A();, B b = new B();
	// ��� : B b = new B(); b��ü ������ ������ �Ѵ� ����� ����
	int num = 100;
	public void cal() {
		int tot = 0;
		for(int i=1; i<=100; i++)
			tot = tot + i;
		System.out.println("�� : "+tot);
	}
	public static void main(String[] args) {
		class_parent cp = new class_parent();
		cp.cal();
		Son s = new Son(1,100);
		s.total();
	}
}

class Son {
	int a, b;
	Son(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void total() {
		int tot = 0;
		for(int i=a; i<=b; i++) {
			tot = tot + i;
			System.out.println("�� : "+tot);
		}
	}
}
