package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Login extends JFrame {
	// �Ӽ� => Label 2��, TextField 2��
	Label id = new Label("���̵�");
	Label pwd = new Label("��й�ȣ");
	TextField tid = new TextField(10);
	TextField tpwd = new TextField(10);
	
	// ������
	Cal_Login() {
		this.setVisible(true);
		this.setBounds(300, 200, 400, 300);
		this.setLayout(new FlowLayout());
		tpwd.setEchoChar('*');
		add(id);
		add(pwd);
		add(tid);
		add(tpwd);
	}
}
