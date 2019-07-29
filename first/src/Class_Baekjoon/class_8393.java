package Class_Baekjoon;
import java.util.*;
public class class_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		if(1<=n && n<=10000) {
			for(int i=0; i<=n; ++i) {
				num += i;
			}
			System.out.println(num);
		}
		else {
			System.out.println("null");
		}
	}
}
