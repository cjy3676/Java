package Class_0619;

import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch2;
		do {
			System.out.println("1. 회원출력하기");
			System.out.println("2. 회원입력하기");
			System.out.println("3. 종료하기");

			System.out.print("무엇을 하겠습니까? ");
			ch2 = sc.nextInt();

			switch (ch2) {
			case 1: // 출력메소드 실행
			case 2: // 입력메소드 실행
			}
		} while (ch2 != 3);
	}

}
