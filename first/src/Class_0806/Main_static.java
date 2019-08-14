package Class_0806;

public class Main_static {

	public static void main(String[] args) {
		// 외부클래스에서의 static 변수 접근(클래스명.변수명)
		System.out.println("이름1 : "+class_static.name1);
		System.out.println("숫자1 : "+class_static.num1);
		System.out.println("숫자2 : "+class_static.num2);
		class_static.test();
		// 외부클래스에서의 객체변수 접근(객체생성후 접근)
		class_static cs = new class_static();
		System.out.println("이름2 : "+cs.name2);
		System.out.println("숫자3 : "+cs.num3);
	}
}
