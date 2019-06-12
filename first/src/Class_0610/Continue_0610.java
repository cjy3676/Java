package Class_0610;

public class Continue_0610 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) {
		    System.out.println("Before continue");
			if (true)
				continue; // 여기서 for문 1번 완료하고 다시 for문으로 
			System.out.println("Hello Java");
		}
	}

}
