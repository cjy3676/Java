package Class_0808;
// ������ => ��� Ŭ������ ��ü�� ������ ����Ǵ� �޼ҵ� 
// �� Ŭ���������� �������� �����ڰ� ���� => ���� ��ü�����ϴ� Ŭ������ ��ӹ޴� Ŭ������ �����Ѵ�
class parent {
	int num = 100;
	public void output() {
		System.out.println("parent");
	}
}
class daughter {
	int num2 = 88;
	public void imsi() {
		System.out.println("daughter");
	}
}
public class son {
	public static void main(String[] args) {
		parent p = new parent();
		p.output();
	}
}
