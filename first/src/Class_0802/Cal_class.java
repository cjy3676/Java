package Class_0802;

public class Cal_class {
	int num1, num2, tot;
	Cal_class(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		tot = num1 + num2;
	}
	public void output() {
		System.out.println(tot);
	}
}
