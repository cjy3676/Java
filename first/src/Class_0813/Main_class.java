package Class_0813;

public class Main_class {

	public static void main(String[] args) {
		Outter ot = new Outter();
	    Outter.Inner2 oi2 = ot.new Inner2();
		ot.num1 = 88;
		oi2.num2 = 99;
	}
}
