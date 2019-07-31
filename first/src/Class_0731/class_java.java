package Class_0731;

public class class_java {
	// 클래스는 객체지향언어의 프로그램 단위 
	// 클래스는 속성(상태, 필드)과 메소드(기능,동작)
	// 속성은 구현하고자 하는 메소드에서 필요한 변수로 구성
	// 메소드는 실제 동작을 정의하는 영역
	
	// 두수의 합을 구하는 프로그램을 예제로 만들어 본다.
	int a, b, total; // 속성, 상태, 필드(멤버변수)
	
	// 기능구현 => 메소드
	public void input() { // 입력기능
		a = 99;
		b = 88;
	}
	
	public void add() { // 더하는 기능
		total = a + b;
	}
	
	public void output() { // 출력하는 기능
		System.out.println(total);
	}
}
