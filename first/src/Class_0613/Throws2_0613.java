package Class_0613;

public class Throws2_0613 {

	public void chul() throws ArithmeticException { // ����޼ҵ�
			int result= 100/0; 
	}

	public static void main(String[] args) {
		// chul(); => static�޼ҵ� �������� static�� ���ٰ���
		Throws2_0613 th = new Throws2_0613();
		try {
			th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ȣ���� ������ ����ó��");
		}
		System.out.println();
	}
}
