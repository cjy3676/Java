package Class_0814;

public class main_thread {

	public static void main(String[] args) {
		/*
		 * class_thread ct = new class_thread(); 
		 * ct.start();
		 */
		Thread_first tf = new Thread_first();
		Thread_second ts = new Thread_second();
		tf.start();
		ts.start();
	}
}
