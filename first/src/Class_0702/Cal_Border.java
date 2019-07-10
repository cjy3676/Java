package Class_0702;

import javax.swing.*;
import java.awt.*;

public class Cal_Border extends JFrame { // 동서남북 중간
	Cal_Border() {
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		Button b1 = new Button("north");
		Button b2 = new Button("south");
		Button b3 = new Button("west");
		Button b4 = new Button("east");
		Button b5 = new Button("center1");
		Button b6 = new Button("center2");
		
		Panel c = new Panel();
	    c.add(b5);
		c.add(b6);
		
		add("North",b1);
		add("South",b2);
		add("West",b3);
		add("East",b4);
		add("Center",c);
	}	
}
