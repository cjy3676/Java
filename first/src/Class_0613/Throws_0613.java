package Class_0613;

public class Throws_0613 {
	
	public void chul() { // ����޼ҵ�
		try {
			int result= 100/5; 
		}
		catch(ArithmeticException e)
		{
			System.out.println("���ܹ߻�");
		}
		
	}

	public static void main(String[] args) {
		// chul(); => static�޼ҵ� �������� static�� ���ٰ���
		Throws_0613 th = new Throws_0613();
		th.chul();
	}

}
