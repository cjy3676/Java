package Class_0801;

public class Cal_return {
	public int random() { // return ���� �־ void ���� 
		int rnum = (int)(Math.random()*45)+1;
		return rnum;  
	}
	
	public static void main(String[] args) {
		Cal_return cr = new Cal_return();
		cr.random();
	}

}
