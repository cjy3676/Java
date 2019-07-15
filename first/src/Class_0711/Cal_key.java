package Class_0711;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_key extends JFrame implements KeyListener {

	TextField tf = new TextField(10);
	Cal_key() {
		this.setVisible(true);
		this.setSize(300, 200);
		this.setLayout(new FlowLayout());
		add(tf);
		tf.addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("press");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("release");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("type");
	}
}
