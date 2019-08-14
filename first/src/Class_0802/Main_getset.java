package Class_0802;

public class Main_getset {

	public static void main(String[] args) {
		Cal_getset cg = new Cal_getset();
		cg.setSubject(90, 80, 70);
		int total = cg.getTotal();
		System.out.println(total);
	}
}
