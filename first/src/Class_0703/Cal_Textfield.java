package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Textfield extends JFrame {
	// �����Է�, ����ǥ��
	Label la = new Label("�ȳ��ϼ���");
	TextField tf = new TextField(10);
	// ������
	Cal_Textfield() {
		this.setVisible(true);
		this.setBounds(300, 200, 400, 200);
		this.setLayout(new FlowLayout());
		add(la);
		add(tf);
	}
}
