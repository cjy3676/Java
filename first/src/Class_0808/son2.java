package Class_0808;
class parent1 {
	int num1 = 100;
	public void outout() {
		System.out.println("parent1");
	}
	parent1() {
		System.out.println("parent1 ������");
	}
}
// �ڽ�Ŭ���� ��ü���� => �ڽ�Ŭ���� ������ȣ�� => �ڽ�Ŭ���� �����ڿ��� �θ�Ŭ������ ������ ȣ��
// => �θ�Ŭ���� ������ ���� => �ڽ�Ŭ���� �����ڽ���
class daughter1 extends parent1 {
	int num2 = 88;
	public void imsi() {
		System.out.println("daughter1");
	}
	daughter1() {
		super();
		System.out.println("daughter1 ������");
	}
}
public class son2 {
	public static void main(String[] args) {
		daughter1 d = new daughter1(); 
	}

}
