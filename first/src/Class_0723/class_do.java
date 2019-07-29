package Class_0723;
import java.util.*;
public class class_do {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("1. 아이언맨");
			System.out.println("2. 스파이더맨");
			System.out.println("3. 헐크");
			System.out.println("4. 토르");
			System.out.println("5. 캡틴 아메리카");
			System.out.println("6. 블랙팬서");
			System.out.println("7. 종료");
			num = sc.nextInt();
		}
		while (num != 7); 
	}

}
