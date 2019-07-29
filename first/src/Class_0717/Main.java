package Class_0717;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num = 0;
		
		if(1<=A && A<=100 && 1<=B && B<=100 && 1<=C && C<=100 ) {
			if((A>=B && B>=C) || (C>=B) && (B>=A)) {
				num = B;
			}
			else if((B>=A && A>=C) || (C>=A && A>=B)) {
				num = A;
			}
			else {
				num = C;
			}
		}
		System.out.println(num);
		}
	}

