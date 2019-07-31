package Class_0729;

public class class_arrays2 {

	public static void main(String[] args) {
		int[] rnum = new int[10];
		
		for(int i=0; i<rnum.length; i++) {
			rnum[i] = (int)(Math.random()*100)+1;
		}
		// 배열에 있는 값을 낮은 순으로 정렬
		int temp; // 값을 교환하기 위한 임시 저장공간
		for(int i=0; i<rnum.length-2; i++) { // 조건을 비교할 기준값
			// i의 길이는 배열의 크기의 -2까지
			for(int j=i+1; j<=rnum.length-1; j++) {
				if(rnum[i]>rnum[j]) {
					temp=rnum[j];
					rnum[i]=rnum[j];
					rnum[j]=temp;
				}
			}
		}
		for(int i=0; i<rnum.length; i++) {
			System.out.println(rnum[i]);
		}
	}
}
