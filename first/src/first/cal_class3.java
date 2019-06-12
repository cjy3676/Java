package first;
import java.util.Scanner;
public class cal_class3 
{
	int kor;
	int eng;
	int mat;
	int tot;
	int avg;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}
	public void total()
	{
		tot = kor + eng + mat;
		System.out.println(tot);
	}
	public void average() 
	{
		avg = tot/3;
		System.out.println(avg);
	}
}
