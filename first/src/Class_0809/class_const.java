package Class_0809;
class father {
	public void output1() {
		System.out.println("Father�� �޼ҵ��Դϴ�");
	}
}
class my extends father { // Overriding => �θ�Ŭ������ �޼ҵ� 
	public void output2() {
		System.out.println("Father�� �޼ҵ带 ����");
	}
}
public class class_const {
	public static void main(String[] args) {
		my m = new my();
		m.output1();
		m.output2();
	}
}
