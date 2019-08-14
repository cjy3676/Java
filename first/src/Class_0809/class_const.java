package Class_0809;
class father {
	public void output1() {
		System.out.println("Father의 메소드입니다");
	}
}
class my extends father { // Overriding => 부모클래스의 메소드 
	public void output2() {
		System.out.println("Father의 메소드를 수정");
	}
}
public class class_const {
	public static void main(String[] args) {
		my m = new my();
		m.output1();
		m.output2();
	}
}
