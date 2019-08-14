package Class_0808;
class parent1 {
	int num1 = 100;
	public void outout() {
		System.out.println("parent1");
	}
	parent1() {
		System.out.println("parent1 생성자");
	}
}
// 자식클래스 객체생성 => 자식클래스 생성자호출 => 자식클래스 생성자에서 부모클래스의 생성자 호출
// => 부모클래스 생성자 실행 => 자식클래스 생성자실행
class daughter1 extends parent1 {
	int num2 = 88;
	public void imsi() {
		System.out.println("daughter1");
	}
	daughter1() {
		super();
		System.out.println("daughter1 생성자");
	}
}
public class son2 {
	public static void main(String[] args) {
		daughter1 d = new daughter1(); 
	}

}
