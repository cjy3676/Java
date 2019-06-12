package Class_0610;
import java.util.Random;
public class Test_0610 {
	public static void main(String[] args) {
		Random r1 = new Random();
		String[] member = {"아이언맨", "스파이더맨", "닥터스트레인지", "토르", "헐크", "캡틴아메리카"};
		int n;
		
		for(;;)
		{
			n=r1.nextInt(4); // 0~3까지의 값 => 3번 X
			if(n==3)  // n이 3일때는 for문을 다시 시작 => 값 다시 발생 
				continue;
			else 
				break;
		}
		
	}
}
