package Class_0819;

class Test1 {
	// private ���������ڴ� �ܺ�X, ���ο��� ó��
	// private �Ӽ��� ���� ó���ϴ� �޼ҵ� => getter, setter
	private Integer num1; // �Ӽ��� ���鶧 ù���ڴ� �ҹ��ڷ�

	public Integer getNum1() { // ���� �������� getter�� return�� ���ؼ� �����´�
		// getter���� => get+������(�ձ��ڴ� �빮��)
		return num1;
	}

	public void setNum1(Integer num1) { // setter�� �Ű������� ���ؼ� 
		// setter���� => set+������(�ձ��ڴ� �빮��)
		this.num1 = num1;
	}
}

class Test2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Non_Generic {
}
