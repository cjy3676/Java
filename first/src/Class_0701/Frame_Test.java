package Class_0701;

import java.awt.Frame;

import javax.swing.JFrame;

public class Frame_Test {

	public static void main(String[] args) { 
		Frame f = new Frame(); // awt
		f.setVisible(true);
		f.setSize(200,200);
		
		JFrame jf = new JFrame(); // swing
		jf.setVisible(true);
		jf.setSize(200,200);
	}

}
