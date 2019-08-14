package Class_0805;

public class Cal_para {
	int num1;
	
	public void imsi() {
		num1 = 100;
		cal(num1); // 기본형변수는 매개변수로 줄때 값 그자체를 전달
	}
	public void cal(int num1) {
		num1++;
		System.out.println("cal()함수 : "+num1);
	}
	public void chul() {
		System.out.println("현재 num1 변수값 : "+num1);
	}
}
