package Class_0806;
// �Ű�����
// 1. ���� => ���� ��ü�� �ƴ϶� ���� ���޵ȴ� => ���� ����, ����X
// 2. �迭
// 3. Ŭ���� => �ּҸ� �����Ѵ� => ������ �޸𸮸� �۾��Ѵ�
public class class_para {
	int num = 100;
	public void imsi() {
		Test.cal(num); // Ŭ������.�޼ҵ��()
		Test t1 = new Test();
		t1.test();
	}
}

class Test {
	// �޼ҵ忡 static ������ �ٸ� Ŭ�������� ��ü�������� ȣ���� ����
	public static void cal(int num) {
		num++;
		System.out.println(num);
	}
	public void test() {
		System.out.println("test");
	}
}
