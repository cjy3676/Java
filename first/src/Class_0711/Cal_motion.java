package Class_0711;

import java.awt.event.*;
import javax.swing.*;

public class Cal_motion extends JFrame implements MouseMotionListener {
	Cal_motion() {
		this.setVisible(true);
		this.setSize(400, 400);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) { // 마우스를 누르면서 이동할때
		this.setTitle("X좌표: "+e.getX());
	}

	@Override
	public void mouseMoved(MouseEvent e) { // 마우스를 이동시킬때
		this.setTitle("Y좌표: "+e.getY());
	}
}
