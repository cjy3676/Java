package Class_0716;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, ans1, ans2, ans3, ans4;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		ans1 = a*(b%10);
		ans2 = a*(b%100-(b%10))/10;
		ans3 = a*(b/100);
		ans4 = ans1 + ans2 * 10 + ans3 * 100;
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}
}




