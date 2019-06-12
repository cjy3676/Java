package first;
public class Class_0604 
{
	public static void main(String[] args) 
	{
		// charAt
		// 남자는 1,3번 / 여자는 2,4번
		String sum1 = "123456-1234567";

		// System.out.println(str.charAt(7)); str.charAt(n): n은 문자의 자리번호
		
		char sum2 = sum1.charAt(7); // 주민번호의 성별을 구분할 수 있는 번호만 가져온다.
		
		if (sum2 == '1' || sum2 == '3') {
			System.out.println("남자 입니다.");
		} 
		else {
			System.out.println("여자 입니다.");
		}
		
		// length
		String sum3 = "hello java";
		System.out.println(sum3.length()); // 문자열의 길이를 구하는 메소드
		
		// replace
		String sum4 = "hello world"; // 문자를 변경하는 메소드
		String new_sum5 = sum4.replace("world", "java");
		System.out.println(new_sum5);
		
		// trim
		String sum6 = "       hello       java world";
		System.out.println(sum6.length());
		String trim_sum6 = sum6.trim();
		System.out.println(trim_sum6.length());
		System.out.println(trim_sum6);
		
		// split
		String sum7 = "아이언맨,스파이더맨/토르-캡틴아메리카";
		String[] name = sum7.split(",|/|-"); // ,/-를 구분자로 하여 나눈다 => 배열에로 저장
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]); // i은 배열 번호
		}
		
		// String class
		String nam = "Iron man";
		String sum8=new String("Iron man");
		
		if(nam.equals(sum8))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
		// Integer
		Integer num = 100;
		Integer num1 = new Integer(90);

		int a = num.intValue();
		short b = num1.shortValue();
		byte c = num.byteValue();
		long d = num1.longValue();
		String ss = num.toString();

		String num3 = new String("123");
		int su = Integer.parseInt(num3); 
		
		// Math
		double I = Math.random(); // return 값이 double형 => 실수
		long R = Math.round(1.6); // return 값이 long => 반올림
		double O = Math.ceil(1.4); // return 값이 double => 올림
		double N = Math.floor(1.5); // return 값이 double => 내림
		Double M = Math.floor(1.5);
		float A = (float)1.5;
		float S = 1.5F;
		
		// double형을 정수형으로 바꾸기
		int f = (int) O;
		
		// Double class
		int g = M.intValue();
		
	}
}
       