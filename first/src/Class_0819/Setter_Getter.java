package Class_0819;

class Test3 {
	int num1;
	private int num2;
	private String name;
	public int getNum1() { 
		return num2; // return���� �ܺ��� �� �ޱ� (3)
		
	}
	public void setNum1(int num2) { // �Ű������� ���ؼ� ���� �ޱ� (2)
		this.num2 = num2; // this�� ���� �ޱ�
	}

}
public class Setter_Getter {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.setNum1(808); // num2�� ���� �ֱ� (1)
		System.out.println(t3.getNum1()); // getter�� �� ��� (4)
	}
}
