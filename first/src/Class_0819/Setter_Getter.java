package Class_0819;

class Test3 {
	int num1;
	private int num2;
	private String name;
	public int getNum1() { 
		return num2; // return으로 외부의 값 받기 (3)
		
	}
	public void setNum1(int num2) { // 매개변수를 통해서 값을 받기 (2)
		this.num2 = num2; // this로 값을 받기
	}

}
public class Setter_Getter {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.setNum1(808); // num2의 값을 주기 (1)
		System.out.println(t3.getNum1()); // getter로 값 출력 (4)
	}
}
