package Class_0729;

import java.util.Arrays;

public class class_sort {

	public static void main(String[] args) {
		int[] rnum = new int[10];

		for (int i = 0; i < rnum.length; i++) {
			rnum[i] = (int) (Math.random() * 100) + 1;
		}
		Arrays.sort(rnum);
		for (int i = 0; i < rnum.length; i++) {
			System.out.println(rnum[i]);
		}
	}
}
