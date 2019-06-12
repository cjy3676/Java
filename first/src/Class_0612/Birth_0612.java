package Class_0612;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Birth_0612 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime birthday = LocalDateTime.of(1995, 2, 28, 7, 30, 00);
		
		long year = birthday.until(today,ChronoUnit.YEARS);
		
		System.out.println(year);
	}

}
