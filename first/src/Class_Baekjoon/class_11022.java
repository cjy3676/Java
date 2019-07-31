package Class_Baekjoon;
import java.util.Scanner;
public class class_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A, B;
		for(int i=1; i<=num; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
		    System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}
	}
}
