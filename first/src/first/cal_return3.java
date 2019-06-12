package first;
import java.util.Scanner;
public class cal_return3 
{
	int kor;
	int eng;
	int mat;
	int tot;
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	
	public int total()
	{
		tot = kor + eng + mat;
		return tot;
	}
}
