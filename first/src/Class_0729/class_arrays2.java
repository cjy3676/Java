package Class_0729;

public class class_arrays2 {

	public static void main(String[] args) {
		int[] rnum = new int[10];
		
		for(int i=0; i<rnum.length; i++) {
			rnum[i] = (int)(Math.random()*100)+1;
		}
		// �迭�� �ִ� ���� ���� ������ ����
		int temp; // ���� ��ȯ�ϱ� ���� �ӽ� �������
		for(int i=0; i<rnum.length-2; i++) { // ������ ���� ���ذ�
			// i�� ���̴� �迭�� ũ���� -2����
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
