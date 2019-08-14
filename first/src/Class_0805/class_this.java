package Class_0805;

public class class_this { // this : 현재 자신의 객체를 부를때 이름 
	// 클래스안에 포함된 요소 => 속성과 메소드
	int num1 = 90;
	int num2 = 80;
	
	public void output() {
		int num1 = 70;
		int num2 = 60;
		System.out.println(num1); // 현재 메소드의 num1변수
		System.out.println(this.num1); // 클래스의 멤버변수 num1
	}
}
