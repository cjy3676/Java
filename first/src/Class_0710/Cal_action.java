package Class_0710;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal_action extends JFrame implements ActionListener {
	Button btn = new Button("Ȯ��");
	
	Cal_action() {
		this.setVisible(true);
		this.setSize(300, 200);
		this.setLayout(new FlowLayout());
		
		add(btn);
		btn.addActionListener(this); // ������Ʈ�� �̺�Ʈ�� ����
	}
	public void actionPerformed(ActionEvent e) { // ����â���� ��ư�� Ŭ���ϸ� ������ ���� �ڵ�
		this.setTitle("Hello java"); // ������â�� ����
	}
}
