package first;
public class Cal_Inst 
{   // instance member, static(�������)
	int kor;
	static String name;
	static int age;
	
	public void input(int kor)
	{
		age = 11;
		this.kor = kor;
	}
	public static void sogae()
	{
		// this.age = 99; (this ���Ұ�)
		// kor = 90; (�ν��Ͻ� ����� ���Ұ�)
		System.out.println(name+" "+age);
	}
}
