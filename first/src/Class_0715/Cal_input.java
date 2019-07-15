package Class_0715;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Cal_input extends JFrame implements ActionListener { // �̸�, �ּ�, ���̸� �Է¹޾Ƽ� DB�� ����
	// Ŭ������ �Ӽ��� �޼ҵ�
	Connection conn;
	Statement stmt;
	Label Lname = new Label("Name");
	Label Lphone = new Label("Phone");
	Label Lage = new Label("Age");
	TextField name = new TextField("20");
	TextField phone = new TextField("10");
	TextField age = new TextField("10");
	Button submit = new Button("Submit");
	Button cancel = new Button("Cancel");
	
	Cal_input() {
		Window_create();
	}
	
	// DB�� ����
	public void DB_conn() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	
	// ���� �Է��ϴ� ������ â�� ����
	public void Window_create() {
		this.setVisible(true);
		this.setSize(300, 200);
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		this.setLayout(new FlowLayout());
		p1.add(Lname);
		p1.add(name);
		p2.add(Lphone);
		p2.add(phone);
		p3.add(Lage);
		p3.add(age);
		p4.add(submit);
		p4.add(cancel);
		submit.addActionListener(this);
		cancel.addActionListener(this);
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
	}
	
	// �Էµ� ���� DB�� �Է��ϴ� �޼ҵ�
	public void DB_input() throws SQLException {
		// DB����
		this.DB_conn();
		// �̸�, ��ȭ��ȣ, ���̸� ��������
		String dname = name.getText();
		String dphone = phone.getText();
		String dage = age.getText();
		// ���� �ۼ�
		String sql = "insert into member(name,phone,age) ";
		sql = sql + "values('"+dname+"','"+dphone+"','"+dage+"')";
		// ���� ����
		stmt.executeUpdate(sql);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ����, ��ҹ�ư 2���� Ŭ��
		Object ob = e.getSource();
		if(ob == submit) {
			try {
				DB_input();
			} 
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			System.exit(0);
		}
		// submit ��ư�� ����
		// cancel 
	}
}
