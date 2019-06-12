package Class_0612;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Time_0612 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		Calendar today2 = Calendar.getInstance();
		LocalDateTime today3 = LocalDateTime.now();
		
		System.out.println(today.toString());
		System.out.println(today2.toString());
		System.out.println(today3.toString());
	}
}
