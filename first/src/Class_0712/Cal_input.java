package Class_0712;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Cal_input extends JFrame implements ActionListener {
	Label Lname = new Label("�̸�");
	TextField name = new TextField(10);
	Label Lphone = new Label("��ȭ��ȣ");
	TextField phone = new TextField(20);
	Button btn = new Button("����");
	Connection conn;
	Statement stmt;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// �̸��� ��ȭ��ȣ�� �����ͼ� ������ ����
		String dbname = name.getText();
		String dbphone = phone.getText();
		// ������ �ۼ�
		String sql = "insert into member(name,phone) ";
		sql = sql + "values('"+dbname+"','"+dbphone+"')";
		try {
			stmt.executeUpdate(sql);
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		name.setText("");
		phone.setText("");
	}
	
	public void close_db() throws SQLException {
		stmt.close();
		conn.close();
	}
	
	Cal_input() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		this.setVisible(true);
		this.setSize(400, 300);
		this.setLayout(new BorderLayout());
	}
}
