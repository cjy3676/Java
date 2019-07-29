package Class_0724;

import java.util.Arrays;

public class class_array3 {

	public static void main(String[] args) {
		int[] num1 = {50,60,70,80,90};
		int[] num2 = Arrays.copyOf(num1, num1.length);
		
		System.out.println(num2.length);
	}

}
