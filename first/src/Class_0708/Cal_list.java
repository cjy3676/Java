package Class_0708;
import java.awt.*;
import javax.swing.*;
public class Cal_list extends JFrame {
	List l1 = new List(5,true); // true�� ��������, false�� 1������
	String[] hero = {"���̾��", "�����̴���", "�丣", "��ũ", "ĸƾ�Ƹ޸�ī"};
	JList jl1 = new JList(hero);
	Cal_list() {
		this.setLayout(new FlowLayout());
		this.setSize(300,100);
		l1.add("������");
		l1.add("ȭ����");
		l1.add("������");
		l1.add("�����");
		l1.add("�ݿ���");
		l1.add("�����");
		l1.add("�Ͽ���");
		
		add(l1);
		add(jl1);
		this.setVisible(true);
	}
}
