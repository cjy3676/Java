package first;
public class Cal_Inst 
{   // instance member, static(정적멤버)
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
		// this.age = 99; (this 사용불가)
		// kor = 90; (인스턴스 멤버는 사용불가)
		System.out.println(name+" "+age);
	}
}
