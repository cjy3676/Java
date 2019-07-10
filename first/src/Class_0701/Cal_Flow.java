package Class_0701;

import java.awt.FlowLayout;

import javax.swing.*;

public class Cal_Flow extends JFrame { // Layout => FlowLayout
	Cal_Flow()
	{
		this.setVisible(true);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JButton jb = new JButton("click");
		JButton jb2 = new JButton("click2");
		this.add(jb);
		this.add(jb2);
	}
}
