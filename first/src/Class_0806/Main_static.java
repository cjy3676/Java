package Class_0806;

public class Main_static {

	public static void main(String[] args) {
		// �ܺ�Ŭ���������� static ���� ����(Ŭ������.������)
		System.out.println("�̸�1 : "+class_static.name1);
		System.out.println("����1 : "+class_static.num1);
		System.out.println("����2 : "+class_static.num2);
		class_static.test();
		// �ܺ�Ŭ���������� ��ü���� ����(��ü������ ����)
		class_static cs = new class_static();
		System.out.println("�̸�2 : "+cs.name2);
		System.out.println("����3 : "+cs.num3);
	}
}
