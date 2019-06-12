package first;
import java.util.Scanner;
public class Test16 
{
  int n;
  int total;
  
  // n값 입력하기
  public void input()
  {
	  Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
  }
  // n값까지 합 구하기
  public void hap()
  {
	  for(int i=1;i<=n;i++)
      	total=total+i;
  }
  // 합 출력
  public void chul()
  {
	  System.out.println(total);
  }
}
