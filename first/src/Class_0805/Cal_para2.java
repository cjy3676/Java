package Class_0805;

public class Cal_para2 {
	int[] arr = new int[3];
	public void imsi() {
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		Test2 t2 = new Test2();
		t2.input(arr);
	}
	class Test2 {
		int[] arr2;
		public void input(int[] arr) {
			this.arr2 = arr;
			arr2[0] = 99;
		}
	}
}
