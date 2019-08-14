package Class_0801;

public class Cal_total {
	public void add() {
		int add = 0; 
		for(int i=1; i<=100; i++) {
			add = add + i;
		}
		System.out.println(add);
	}
	public void add(int n) {
		int add = 0;
		for(int i=1; i<=n; i++) {
			add = add + i;
		}	
		System.out.println(add);
	}
	public void add(int a, int b) {
		int add = 0;
		for(int i=a; i<=b; i++) {
			add = add + i;
		}
		System.out.println(add);
	}
	public static void main(String[] args) {
		Cal_total ct = new Cal_total();
		ct.add();
		ct.add(100);
		ct.add(1,100);
	}
}
