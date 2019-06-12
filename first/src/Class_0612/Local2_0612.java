package Class_0612;

import java.time.LocalDateTime;

public class Local2_0612 {
	public static void main(String[] args) 
	{
		LocalDateTime today = LocalDateTime.now();
		
		String yo = today.getDayOfWeek().toString();
		
		LocalDateTime xday = LocalDateTime.of(1995, 2, 28, 7, 30, 00);
		
		String yo2 = xday.getDayOfWeek().toString();
		System.out.println(yo+" "+yo2);
	}

}
