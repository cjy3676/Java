package Class_0819;
class Array<T> {
	private T[] arr;
	private int n=0;
	public T[] getArr() {
		return arr;
	}
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	public void add(T str) {
		arr[n] = str;
		n++;
	}
}
public class ArrayTest {

	public static void main(String[] args) {
		String[] aa = new String[10];
		Array<String> a = new Array<String>();
		
	}
}
