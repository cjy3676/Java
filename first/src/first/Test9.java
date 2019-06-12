package first;
public class Test9 
{   // 9.  num1=99,  num2=88 이라는 숫자가 저장되어 있다고 할때 두변수의 값을 교환하시오. ( num1=88 , num2=99)
	public static void main(String[] args) 
	{
		int num1 = 99;
		int num2 = 88;
		int num3 = 0;
		System.out.println(num1+"/"+num2);
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println(num1+"/"+num2);
	}
}
