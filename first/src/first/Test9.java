package first;
public class Test9 
{   // 9.  num1=99,  num2=88 �̶�� ���ڰ� ����Ǿ� �ִٰ� �Ҷ� �κ����� ���� ��ȯ�Ͻÿ�. ( num1=88 , num2=99)
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
