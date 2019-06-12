package first;
public class Test_4 
{
	public static void main(String[] args) 
	{
		int num = 0;
		for (int i=1; i<=100; i=i+2) 
		{
			num = num + i;
		}
		
		System.out.println(num);
		
		/* for (int i=1; i<=100; i++) 
		{
			if (i % 2 ==1)  // ¸ðµç¼ö¸¦ 2·Î ³ª´« ³ª¸ÓÁö°¡ 0(Â¦¼ö), 1(È¦¼ö)
				num = num + i;
		}
		
		System.out.println("È¦¼öÀÇ ÇÕ:"+num); */
	}
}
