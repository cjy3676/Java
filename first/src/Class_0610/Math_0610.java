package Class_0610;
import java.util.Random;
public class Math_0610 
{
	public static void main(String[] args) 
	{
		Random rd = new Random();

		boolean r1 = rd.nextBoolean(); // true or false
		System.out.println(r1);
		
		double r2 = rd.nextDouble();
		System.out.println(r2);
		
		int r3 = rd.nextInt();
		System.out.println(r3);
		
		int r4 = rd.nextInt(2); // 2보다 작은 정수 
		System.out.println(r4);
		// int ra = rd.nextInt("범위")+시작값; 
		
		int r5;
		int n = 0;
		for (;;) // 무한반복 
		{
			r5 = rd.nextInt(80) + 1020;
			if (r5 == 1079)
				break;
			n++;
		}
		System.out.println(r5 + " " + n);
	}
}
