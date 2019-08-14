package Class_0813;

public class Outter2 { // 내부클래스가 static일때
	static class Inner3 { 
		int num = 88;
		public void output1() {
			System.out.println(num);
		}
		public static void output2() {
			System.out.println("static메소드입니다");
		}
	}

}
