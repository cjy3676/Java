package Class_0801;

public class Cal_return {
	public int random() { // return 값이 있어서 void 없이 
		int rnum = (int)(Math.random()*45)+1;
		return rnum;  
	}
	
	public static void main(String[] args) {
		Cal_return cr = new Cal_return();
		cr.random();
	}

}
