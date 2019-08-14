package Class_0813;

public class Interface_Nested {
	interface total { // 속성, 메소드는 생략
		void test();
	}
}

class Inter_Imple implements Interface_Nested.total {

	@Override // 재정의 => 상속받는 클래스의 메소드, 인터페이스의 추상메소드
	public void test() {
		// TODO Auto-generated method stub		
	}
}
