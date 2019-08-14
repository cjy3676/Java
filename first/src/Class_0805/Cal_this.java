package Class_0805;

public class Cal_this {
	int num1,num2,tot;
	Cal_this() {
		this(1,100);
	}
	Cal_this(int num2) {
		this(1,100);
	}
	Cal_this(int num1, int num2) {
		for(int i=num1; i<=num2; i++)
			tot =tot + i;
		System.out.println(tot);
	}
}
