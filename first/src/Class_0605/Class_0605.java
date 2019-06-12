package Class_0605;
public class Class_0605 
{
	// return을 사용하는 방법
	public void aa(int a, int b) {
		if (a > b) {
			System.out.println("first");
		} else {
			System.out.println("second");
		}
	}

	public int bb(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Class_0605 rt = new Class_0605();
		rt.aa(90, 100);
		System.out.println(rt.bb(88, 99));
	}
}
