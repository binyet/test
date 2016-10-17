package DBtest;

import java.sql.*;

public class DBdemo {

	private static final String URL="jdbc:mysql://127.0.0.1:3306/test";
	private static final String USER = "root";
	private static final String PASSWORD = "lubin";
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from test");
			
			while(rs.next()){
				System.out.println(rs.getString("id") + ","+rs.getInt("password"));
			}
		} catch (Exception e) {
			System.out.println("异常");
		}
	}

}
