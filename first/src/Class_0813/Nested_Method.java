package Class_0813;

public class Nested_Method {
	int num1 = 99;
	public void chul() {
		System.out.println(num1);
	}
	public void output() {
		class Method_In {
			int num2 = 77;
			public void chul() {
				System.out.println(num2);
			}
		}
		Method_In mi = new Method_In();
		mi.chul();
	}
}
