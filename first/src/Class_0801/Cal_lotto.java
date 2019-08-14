package Class_0801;

public class Cal_lotto {
	public String random() {
		return 
	}
	public int[] random2() {
		int[] rnum = new int[6];
		for(int i=0; i<6; i++) {
			rnum[i] =(int)(Math.random()*45)+1;
		}
		return rnum;
	}
	public static void main(String[] args) {
		Cal_lotto cl = new Cal_lotto();
		String rnum = cl.random();
		System.out.println(rnum);
		int[] rnum = cl.random2();
		for(int i=0; i<6; i++) {
			System.out.print(rnum[i]+" ");
		}
	}

}
