package Class_0806;

public class class_para2 {
	int[] arr = {21, 43, 55};
	public void imsi() {
		Test2.cal(arr);
		System.out.println(arr[0]);
	}
}

class Test2 {
	public static void cal(int[] arr) {
		arr[0]++;
		arr[1]++;
		arr[2]++;
	}
}