package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Button extends JFrame {
	// �Ӽ�
	Button bt = new Button("Ȯ��");
	JButton bt2 = new JButton("���");
	// ������
	Cal_Button() {
		setVisible(true);
		setSize(300,300);
		// component �߰����� ���̾ƿ��� ó��
		setLayout(new FlowLayout());
		// component �߰�
		add(bt);
		add(bt2);
	}
	// �޼ҵ�
}
