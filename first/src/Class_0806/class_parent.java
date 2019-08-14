package Class_0806;

public class class_parent {
	// 상속 : 다른 클래스의 속성, 메소드를 나의 클래스에 포함시키는 개념
	// A클래스와 내가 만든 B클래스를 사용한다
	// 각각의 클래스를 사용할 수 있는 A a = new A();, B b = new B();
	// 상속 : B b = new B(); b객체 변수만 가지고 둘다 사용이 가능
	int num = 100;
	public void cal() {
		int tot = 0;
		for(int i=1; i<=100; i++)
			tot = tot + i;
		System.out.println("합 : "+tot);
	}
	public static void main(String[] args) {
		class_parent cp = new class_parent();
		cp.cal();
		Son s = new Son(1,100);
		s.total();
	}
}

class Son {
	int a, b;
	Son(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void total() {
		int tot = 0;
		for(int i=a; i<=b; i++) {
			tot = tot + i;
			System.out.println("합 : "+tot);
		}
	}
}
