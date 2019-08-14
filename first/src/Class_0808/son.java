package Class_0808;
// 생성자 => 모든 클래스의 객체가 생성시 실행되는 메소드 
// 한 클래스내에는 여러개의 생성자가 존재 => 실제 객체생성하는 클래스는 상속받는 클래스가 존재한다
class parent {
	int num = 100;
	public void output() {
		System.out.println("parent");
	}
}
class daughter {
	int num2 = 88;
	public void imsi() {
		System.out.println("daughter");
	}
}
public class son {
	public static void main(String[] args) {
		parent p = new parent();
		p.output();
	}
}
