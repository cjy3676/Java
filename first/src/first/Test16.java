package first;
import java.util.Scanner;
public class Test16 
{
  int n;
  int total;
  
  // n�� �Է��ϱ�
  public void input()
  {
	  Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
  }
  // n������ �� ���ϱ�
  public void hap()
  {
	  for(int i=1;i<=n;i++)
      	total=total+i;
  }
  // �� ���
  public void chul()
  {
	  System.out.println(total);
  }
}
