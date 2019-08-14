package Class_0812;

public class class_try {

	public static void main(String[] args) {
	 try {
	  int a = 100;
	  int b = 0;
	  int c = a/b;
	 
	  int[] arr = new int[3];
	  arr[3] =  99;
	 }
	 catch(Exception e) {
		 // Exception클래스를 사용한다 => 어떤예외 발생할지 모를때, 어떤 예외가 오더라도 catch에서 실행할 내용이 같을때
		 System.out.println("0으로 나누는 예외발생");
	 }
	 System.out.println("계속 프로그램이 진행");
	}
}
