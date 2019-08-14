package Class_0808;
class parent2 {
	int num1;
	public void output() {
		System.out.println(num1);
	}
	parent2(int num1) {
		this.num1 = num1;
	}
}
class daughter2 extends parent2 {
	int num2;
	public void imsi() {
		System.out.println();
	}
	daughter2(int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}
}
public class son3 {

	public static void main(String[] args) {
		daughter2 d2 = new daughter2(99,88); 
	}
}
