package Class_0801;
import java.util.Scanner;

public class Cal_random {
	Scanner sc = new Scanner(System.in);
	// 1~45������ ������ �� �߻��ϴ� �Լ�
	public void output() {
		int rnum = (int)(Math.random()*45)+1;
		System.out.println(rnum);
	}
	// 1~n������ ������ �� �߻��ϴ� �Լ�
    public void output(int n) {
    	int rnum = (int)(Math.random()*n)+1;
		System.out.println(rnum);
	}
	// a~b������ ������ �� �߻��ϴ� �Լ�
    public void output(int a, int b) {
		int num = b-a+1;
		int rnum = (int)(Math.random()*num)+a;
		System.out.println(rnum);
	}
	public static void main(String[] args) {
		Cal_random cr = new Cal_random();
		cr.output();
		cr.output(30);
		cr.output(20,50);
	}
}
