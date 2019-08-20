package Class_0819;
class Test4<T> {
	private T num;
	public T getName() {
		return num;
	}
	public void setName(T num) {
		this.num = num;
	}
}
public class Generic_Class {

	public static void main(String[] args) {
		Test4<Integer> t1 = new Test4<Integer>();
		t1.setName(99);
		System.out.println(t1.getName());
		
		Test4<String> t2 = new Test4<String>();
		t2.setName("아이언맨");
		System.out.println(t2.getName()); 
		
		Test4<Boolean> t3 = new Test4<Boolean>();
		t3.setName(true);
		System.out.println(t3.getName());
	}
}
