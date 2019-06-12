package Class_0611;
import java.util.Date;
public class Date_0611 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		int y=today.getYear()+1900;
		
		int m=today.getMonth()+1;
		String m2=m+""; // 숫자를 문자로 바꾸는 방법
		// m이 한자리 일 경우 (1~9월) 앞에 0을 붙인다
		if(m2.length()==1) // 문자열 바꾼후 길이가 1이면
			m2="0"+m; // 항상 실행하면 안된다
		
		int d=today.getDate();
		String d2=d+"";
		if(d2.length()==1)
			d2="0"+d2;
		// 2019-06-11로 출력해보기
		String ch1= y+"-"+m2+"-"+d2;
		// 2019년 06월 11일 
		// 10:30:31 (시분초) 출력하기
	}
}
