package Class_Baekjoon;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(1 <= N && N <= 9) {
			for(int i=1; i<=9; ++i) {
				System.out.println(N + " * " + i + " = " + (N*i));
			}	
		}
		else {
			System.out.println("null");
		}
	}
}
