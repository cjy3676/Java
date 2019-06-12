package Class_0612;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Local_0612 
{
	public static void main(String[] args) 
	{
		LocalDateTime today = LocalDateTime.now();
		
		int y = today.getYear();
		int m = today.getMonthValue();
		int d = today.getDayOfMonth();
		
		String yo = today.getDayOfWeek().toString(); // ��������
		int yo2 = today.getDayOfWeek().getValue(); // ���ڷ� 1(��)~7(��)
		
		int hh = today.getHour();
		int mm = today.getMinute();
		int ss = today.getSecond();
		
		// ���� ���� isLeapYear // LocalDate Ŭ������ ����޼ҵ�
		LocalDate toto = LocalDate.now();
		System.out.println(toto.isLeapYear());
		
		String chul = y+"�� "+m+"�� "+d+"�� "+yo+" "+hh+"�� "+mm+"�� "+ss+"��";
		System.out.println(chul);
	}
}
