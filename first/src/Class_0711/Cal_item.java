package Class_0711;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_item extends JFrame implements ItemListener {

	Choice ch = new Choice();
	Cal_item() {
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		
		ch.add("���̾��");
		ch.add("�����̴���");
		ch.add("�丣");
		ch.add("��ũ");
		ch.add("ĸƾ �Ƹ޸�ī");
		ch.add("���Ҽ�");
		ch.addItemListener(this);
		add(ch);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
