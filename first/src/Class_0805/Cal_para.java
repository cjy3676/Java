package Class_0805;

public class Cal_para {
	int num1;
	
	public void imsi() {
		num1 = 100;
		cal(num1); // �⺻�������� �Ű������� �ٶ� �� ����ü�� ����
	}
	public void cal(int num1) {
		num1++;
		System.out.println("cal()�Լ� : "+num1);
	}
	public void chul() {
		System.out.println("���� num1 ������ : "+num1);
	}
}
