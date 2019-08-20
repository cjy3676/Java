package Class_0820;

import java.util.Scanner;

class Test<T> {
	private T som;

	public T getSom() {
		return som;
	}

	public void setSom(T som) {
		this.som = som;
	}
}
public class Generic_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String som = sc.next(); 
		Test<String> ts = new Test<String>();
		ts.setSom(som);
		System.out.println(ts.getSom());
	}
}
