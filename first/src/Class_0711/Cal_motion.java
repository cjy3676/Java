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
	public void mouseDragged(MouseEvent e) { // ���콺�� �����鼭 �̵��Ҷ�
		this.setTitle("X��ǥ: "+e.getX());
	}

	@Override
	public void mouseMoved(MouseEvent e) { // ���콺�� �̵���ų��
		this.setTitle("Y��ǥ: "+e.getY());
	}
}
