package com.suma;
import java.sql.*;

public class MysqlCon {

	public static void main(String[] args) {
		// Database connection code
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "test");
			
			if(con != null) {
				System.out.println("Connected to Database");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
				
			}
			con.close();
			}else {
				System.out.println("Could not connect to Database");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
