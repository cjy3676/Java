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
		System.out.print(y + "�� " + m + "�� " + d + "��");
		
		int dd = today.get(Calendar.DAY_OF_WEEK);
		String day="";
		switch(dd)
		{
		case 1: day="�Ͽ���"; break;
		case 2: day="������"; break;
		case 3: day="ȭ����"; break;
		case 4: day="������"; break;
		case 5: day="�����"; break;
		case 6: day="�ݿ���"; break;
		case 7: day="�����"; break;
		}
		
		
		String am = "����";
		int ap = today.get(Calendar.AM_PM);
		if(ap==0)
		{
			System.out.print(am);
		}
	}
}
