package Class_0722;
import java.util.*;
public class class_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일수를 알고 싶은 월을 입력하시오");
		int M = sc.nextInt();
		
		switch(M) {
		case 1: System.out.println("월의 날수는 31"); break;
		case 2: System.out.println("월의 날수는 28"); break;
		case 3: System.out.println("월의 날수는 31"); break;
		case 4: System.out.println("월의 날수는 30"); break;
		case 5: System.out.println("월의 날수는 31"); break;
		case 6: System.out.println("월의 날수는 30"); break;
		case 7: System.out.println("월의 날수는 31"); break;
		case 8: System.out.println("월의 날수는 31"); break;
		case 9: System.out.println("월의 날수는 30"); break;
		case 10: System.out.println("월의 날수는 31"); break;
		case 11: System.out.println("월의 날수는 30"); break;
		case 12: System.out.println("월의 날수는 31"); break;
		}
		
	}
}
