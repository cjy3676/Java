package Class_0708;
import java.awt.*;
import javax.swing.*;
public class Cal_choice extends JFrame {
	Choice c1 = new Choice(); // select �±� 
	JComboBox cb;
	String[] hero = {"���̾��", "�����̴���", "�丣", "��ũ", "ĸƾ�Ƹ޸�ī"};
	Cal_choice() {
		this.setLayout(new FlowLayout());
		this.setSize(300,100);
		c1.add("������");
		c1.add("ȭ����");
		c1.add("������");
		c1.add("�����");
		c1.add("�ݿ���");
		c1.add("�����");
		c1.add("�Ͽ���");
		add(c1);
		
		cb = new JComboBox(hero);
		add(cb);
		
		this.setVisible(true);
	}
}
