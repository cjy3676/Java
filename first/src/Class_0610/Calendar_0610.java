package Class_0610;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_0610 
{
	public static void main(String[] args) 
	{
		// TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
		Calendar today = Calendar.getInstance();
		// System.out.println(today.toString());
		int y = today.get(Calendar.YEAR);

		int mo = today.get(Calendar.MONTH);
		int m = mo + 1;

		int d = today.get(Calendar.DAY_OF_MONTH);
		System.out.print(y + "년 " + m + "월 " + d + "일");
		
		int dd = today.get(Calendar.DAY_OF_WEEK);
		String day="";
		switch(dd)
		{
		case 1: day="일요일"; break;
		case 2: day="월요일"; break;
		case 3: day="화요일"; break;
		case 4: day="수요일"; break;
		case 5: day="목요일"; break;
		case 6: day="금요일"; break;
		case 7: day="토요일"; break;
		}
		
		
		String am = "오전";
		int ap = today.get(Calendar.AM_PM);
		if(ap==0)
		{
			System.out.print(am);
		}
	}
}
