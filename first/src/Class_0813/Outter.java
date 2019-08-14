package Class_0813;

public class Outter {
	int num1;
	public void output() {
		System.out.println(num1);
		Inner2 i2 = new Inner2();
		System.out.println(i2.num2);
	}
	class Inner2 {
		int num2;
		public void total() {
			int tot = num1 + num2;
			System.out.println(tot);
		}
	}
}
