package Class_0723;

import java.util.*;

public class class_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num = 0;
		
		for(int i=A; i<=B; i++) {
			num += i;
		}
		System.out.println(num);
	}

}
