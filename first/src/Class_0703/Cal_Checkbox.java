package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Checkbox extends JFrame {
	Checkbox cb1 = new Checkbox("���̾��",true);
	Checkbox cb2 = new Checkbox("�����̴���");
	Checkbox cb3 = new Checkbox("��ũ");
	Checkbox cb4 = new Checkbox("�丣");
	
	JCheckBox jcb1 = new JCheckBox("ĸƾ �Ƹ޸�ī",true);
	JCheckBox jcb2 = new JCheckBox("���Ҽ�");
	JCheckBox jcb3 = new JCheckBox("���� ��Ʈ������");
	JCheckBox jcb4 = new JCheckBox("��Ʈ��",true);
	
	Cal_Checkbox() {
		this.setVisible(true);
		this.setBounds(200, 100, 300, 300);
		this.setLayout(new FlowLayout());
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}
