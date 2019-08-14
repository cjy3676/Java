package Class_0813;

public class Instance_Nested {
	// 속성
	int num;
	// 메소드
	public void output() {
		System.out.println(num);
	}
	// 클래스
	class Inner {
		int num2 = 99;
		public void output() {
			System.out.println(num2);
		}
	}
}
