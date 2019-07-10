package Class_0627;
import java.util.Scanner;
public class Select_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		Cal_select cs = new Cal_select();
		do { // while반복문의 변형 => 무조건 1번 실행하고 조건이 나오는 
			System.out.println("1. a에서 b의 합을 구하기");
			System.out.println("2. a부터 b까지의 임의의 수");
			System.out.println("3. 오늘 밥  계산할 사람");
			System.out.println("4. 종료");
			num = sc.nextInt();
			
			// 입력값에 따라 필요한 메소드 호출
			switch(num) {
			case 1: cs.add_chul(); break;
			case 2: cs.random_chul();  break;
			case 3: cs.choice_chul();  break;
			}
		} while(num != 4); // 사용자가 5를 입력하면 종료
	}
}
