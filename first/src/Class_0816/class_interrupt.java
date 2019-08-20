package Class_0816;

public class class_interrupt {
	public static void main(String[] args) {
		Inter_Thread it = new Inter_Thread();
		it.start();
		
		it.interrupt();
	}
}
class Inter_Thread extends Thread {
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i+"번 실행중");
			i++;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					break;
				}
		}
		System.out.println("종료");
	}
}