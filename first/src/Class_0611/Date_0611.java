package Class_0611;
import java.util.Date;
public class Date_0611 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		int y=today.getYear()+1900;
		
		int m=today.getMonth()+1;
		String m2=m+""; // ���ڸ� ���ڷ� �ٲٴ� ���
		// m�� ���ڸ� �� ��� (1~9��) �տ� 0�� ���δ�
		if(m2.length()==1) // ���ڿ� �ٲ��� ���̰� 1�̸�
			m2="0"+m; // �׻� �����ϸ� �ȵȴ�
		
		int d=today.getDate();
		String d2=d+"";
		if(d2.length()==1)
			d2="0"+d2;
		// 2019-06-11�� ����غ���
		String ch1= y+"-"+m2+"-"+d2;
		// 2019�� 06�� 11�� 
		// 10:30:31 (�ú���) ����ϱ�
	}
}
