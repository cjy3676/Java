package Class_0724;
import java.util.*;
public class class_array2 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		int temp = nums[0];
		
		for(int i=1; i<=4; i++) {
			if(temp>nums[i])
				temp=nums[i];
		}
		/*
		Arrays.sort(nums);
		System.out.println(nums[0]);
		*/
	}

}
