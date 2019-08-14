package Class_0806;
// 매개변수
// 1. 변수 => 변수 자체가 아니라 값만 전달된다 => 값만 전달, 동일X
// 2. 배열
// 3. 클래스 => 주소를 전달한다 => 동일한 메모리를 작업한다
public class class_para {
	int num = 100;
	public void imsi() {
		Test.cal(num); // 클래스명.메소드명()
		Test t1 = new Test();
		t1.test();
	}
}

class Test {
	// 메소드에 static 붙으면 다른 클래스에서 객체생성없이 호출이 가능
	public static void cal(int num) {
		num++;
		System.out.println(num);
	}
	public void test() {
		System.out.println("test");
	}
}
