package Class_0801;

import java.sql.*;

public class Cal_private1 {
	private String pwd ="1234";
	private Connection conn;
	
	Cal_private1() throws SQLException {
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/pension?useSSL=false","root","1234");
	}
	public Connection return_db() {
		return conn;
	}
	public String check(String pwd) {
		if(this.pwd == pwd)
			return "맞음";
		else
			return "틀림";
	}
}
