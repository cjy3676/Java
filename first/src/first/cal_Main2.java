package first;
public class cal_Main2 
{
	public static void main(String[] args) 
	{
		cal_class3 cc = new cal_class3();
		cc.input();
		System.out.print("모든수의 합은 ");
		cc.total(); 
		System.out.print("모든수의 평균은 ");
		cc.average();
		
		System.out.println(cc.tot + cc.eng);
	}
}
