package first;
import java.util.Date;
public class Class_0603 
{
	public static void main(String[] args) 
	{
		// 대입연산자를 통해 오른쪽에 있는 값을 왼쪽으로 줄 경우
		int a = 99; // 변수
		int b = a; // a라는 정수형 변수에 있는 값을 왼쪽의 변수에 저장
		
		// 배열
		int[] kor = new int[3];
		kor[0] = 100;
		kor[1] = 99;
		kor[2] = 88;
		int[] kkk = kor;
		System.out.println(kkk[1]);
		
		// 객체
		Date today = new Date();
		System.out.println(today.getDate());

		Date ttt = today;
		System.out.println(ttt.getDate());
		
		String phone = "010-1234-5678";
		String[] pho = phone.split("-");
		// pho배열에 "-"문자를 기준으로 자른 내용을 자른 내용을 0인덱스부터 차례로

		System.out.println(pho[0]);
		System.out.println(pho[1]);
		System.out.println(pho[2]);

		/*
		 * int a = phone.indexOf("-"); int b = phone.lastIndexOf("-");
		 * 
		 * String first = phone.substring(0, a); String second = phone.substring(a + 1,
		 * b); String third = phone.substring(b + 1);
		 * 
		 * System.out.println(first + " " + second + " " + third);
		 */
	}
}
