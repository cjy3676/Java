package Class_0701;

import java.awt.*;

import javax.swing.JFrame;

public class Class_frame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(200,200);
		Button b = new Button("click");
		Label aa = new Label("hello");
		f.add(b);
		f.add(aa);
	}

}
