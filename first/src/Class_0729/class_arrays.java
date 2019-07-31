package Class_0729;

public class class_arrays {

	public static void main(String[] args) {
		int[] rnum = new int[4];
		
		for(int i=0; i<4; i++) {
			rnum[i] = (int)(Math.random()*45)+1;
		}
		// 배열에 있는 값을 낮은 순으로 정렬
		int temp; // 값을 교환하기 위한 임시 저장공간
		if(rnum[0]<rnum[1]) { // 초기값 temp에 값을 주고 교환
			temp=rnum[0]; rnum[0]=rnum[1]; rnum[1]=temp; 
		}
        if(rnum[0]<rnum[2]) {
        	temp=rnum[0]; rnum[0]=rnum[2]; rnum[2]=temp;
		}
        if(rnum[0]<rnum[3]) {
        	temp=rnum[0]; rnum[0]=rnum[3]; rnum[3]=temp;
        }
        if(rnum[0]<rnum[4]) {
        	temp=rnum[0]; rnum[0]=rnum[4]; rnum[4]=temp;
        }
        if(rnum[1]<rnum[2]) {
        	temp=rnum[1]; rnum[1]=rnum[2]; rnum[2]=temp;
        }
        if(rnum[1]<rnum[3]) {
        	temp=rnum[1]; rnum[1]=rnum[3]; rnum[3]=temp;
        }
        if(rnum[1]<rnum[4]) {
        	temp=rnum[1]; rnum[1]=rnum[4]; rnum[4]=temp;
        }
        if(rnum[2]<rnum[3]) {
        	temp=rnum[2]; rnum[2]=rnum[3]; rnum[3]=temp;	
        }
        if(rnum[2]<rnum[4]) {
        	temp=rnum[2]; rnum[2]=rnum[4]; rnum[4]=temp;
        }
        if(rnum[3]<rnum[4]) {
        	temp=rnum[3]; rnum[3]=rnum[4]; rnum[4]=temp;
        }
        
		for(int i=0; i<4; i++) {
			System.out.println(rnum[i]);
		}
	}
}
