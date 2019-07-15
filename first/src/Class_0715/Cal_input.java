package Class_0715;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Cal_input extends JFrame implements ActionListener { // 이름, 주소, 나이를 입력받아서 DB에 저장
	// 클래스는 속성과 메소드
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
	
	// DB에 연결
	public void DB_conn() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	
	// 값을 입력하는 윈도우 창을 생성
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
	
	// 입력된 값을 DB에 입력하는 메소드
	public void DB_input() throws SQLException {
		// DB연결
		this.DB_conn();
		// 이름, 전화번호, 나이를 가져오기
		String dname = name.getText();
		String dphone = phone.getText();
		String dage = age.getText();
		// 쿼리 작성
		String sql = "insert into member(name,phone,age) ";
		sql = sql + "values('"+dname+"','"+dphone+"','"+dage+"')";
		// 쿼리 실행
		stmt.executeUpdate(sql);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 저장, 취소버튼 2개가 클릭
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
		// submit 버튼은 저장
		// cancel 
	}
}
