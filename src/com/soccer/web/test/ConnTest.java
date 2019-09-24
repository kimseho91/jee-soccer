package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe",
				username = "c##bitseho",
				password = "oracle";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,username,password);
			if(conn != null) {
				System.out.println("연결 성공");
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT DISTINCT POSITION\r\n" + 
						"FROM PLAYER");
				List<String> list = new ArrayList<>();
				while(rs.next()) {
					list.add(rs.getString("POSITION"));
				}
				System.out.println("포지션 :\n "+list);
			}else {
				System.out.println("연결 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
