package Class_0627;
import java.util.Scanner;
public class Cal_select {
	Scanner sc;
	String[] name;
	int a;
	int b;
	
	Cal_select() {
		sc = new Scanner(System.in);
		name = new String[3];
	}
	
	public void add_chul() {
		System.out.println("a값을 입력하세요");
		a = sc.nextInt();
		System.out.println("b값을 입력하세요");
		b = sc.nextInt();
		
		int total = 0;
		for(int i=a; i<=b; i++) {
			total = total + i;
		}
		System.out.println(total);
	}
	public void random_chul() {
		System.out.println("a값을 입력하세요");
		a = sc.nextInt();
		System.out.println("b값을 입력하세요");
		b = sc.nextInt();
		int num = b-a+1;
		int rnum = (int)(Math.random()*num)+a;
		System.out.println(rnum);
	}
	public void choice_chul() {
		for(int i=0; i<3; i++)
		{
			System.out.println("이름을 입력하세요");
			name[i] = sc.next();
		}
		int rnum = (int)(Math.random()*3);
		System.out.println(name[rnum]);
	}
}
